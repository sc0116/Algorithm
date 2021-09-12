import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, k, answer = 100001;
    static int[] coin, dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        coin = new int[n];

        dp = new int[k + 1];
        Arrays.fill(dp, 100001);

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }

        System.out.println(dp[k] == 100001 ? -1 : dp[k]);
    }
}
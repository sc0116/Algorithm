import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, k, money;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        dp = new int[k + 1];

        dp[0] = 1;
        for(int i = 0; i < n; i++) {
            money = Integer.parseInt(br.readLine());
            for(int j = money; j <= k; j++) {
                dp[j] += dp[j - money];
            }
        }
        System.out.println(dp[k]);
    }
}
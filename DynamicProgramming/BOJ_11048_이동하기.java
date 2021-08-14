import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m, candy;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dp = new int[n + 1][m + 1];

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= m; j++) {
                candy = Integer.parseInt(st.nextToken());
                dp[i][j] = candy + Math.max(dp[i - 1][j], Math.max(dp[i][j - 1], dp[i - 1][j - 1]));
            }
        }
        System.out.println(dp[n][m]);
    }
}
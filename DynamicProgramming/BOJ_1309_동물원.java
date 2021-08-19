import java.io.*;
import java.util.Arrays;

public class Main {

    static int n, answer = 0;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new int[n + 1][3];
        Arrays.fill(dp[1], 1);

        for(int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }

        for(int i = 0; i < 3; i++) {
            answer += dp[n][i];
        }

        System.out.println(answer % 9901);
    }
}
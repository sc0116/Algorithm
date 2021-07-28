import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int n, i, j, k, result = 1000 * 1000 + 1;
        int[][] arr, dp;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new int[n][n];

        StringTokenizer st;
        for(i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            for(j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(k = 0; k < 3; k++) {
            for(i = 0; i < 3; i++) {
                dp[0][i] = (i == k) ? arr[0][i] : 1000 * 1000 + 1;
            }

            for(i = 1; i < n; i++) {
                dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            }

            for(i = 0; i < 3; i++) {
                if(i != k) {
                    result = Math.min(result, dp[n - 1][i]);
                }
            }
        }
        System.out.println(result);
    }
}
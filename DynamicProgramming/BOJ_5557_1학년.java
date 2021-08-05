import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] arr;
    static long[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        dp = new long[n - 1][21];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0][arr[0]] = 1;

        for(int i = 0; i < n - 2; i++) {
            for(int j = 0; j <= 20; j++) {
                if(dp[i][j] != 0) {
                    if(j - arr[i + 1] >= 0) {
                        int n = j - arr[i + 1];
                        dp[i + 1][n] += dp[i][j];
                    }
                    if(j + arr[i + 1] <= 20) {
                        int n = j + arr[i + 1];
                        dp[i + 1][n] += dp[i][j];
                    }
                }
            }
        }
        System.out.println(dp[n - 2][arr[n - 1]]);
    }
}
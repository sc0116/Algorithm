import java.io.*;

public class Main {

    static int n;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        if(n == 1) System.out.println(1 % 15746);
        else if(n == 2) System.out.println(2 % 15746);
        else {
            dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3; i <= n; i++) {
                dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
            }
            System.out.println(dp[n]);
        }
    }
}
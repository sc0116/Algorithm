import java.io.*;
import java.math.BigInteger;

public class Main {

    static int n;
    static BigInteger[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        if (n == 0) {
            System.out.println("0");
        } else if (n == 1) {
            System.out.println("1");
        } else {
            dp = new BigInteger[n + 1];

            dp[0] = BigInteger.ZERO;
            dp[1] = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 2].add(dp[i - 1]);
            }

            System.out.println(dp[n]);
        }
    }
}
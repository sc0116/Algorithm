import java.io.*;

public class Main {

    static int n;
    static double[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new double[n];

        for (int i = 0; i < n; i++)
            dp[i] = Double.parseDouble(br.readLine());

        double max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1] * dp[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.println(String.format("%.3f", max));
    }
}
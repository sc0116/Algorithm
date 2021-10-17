import java.io.*;

public class Main {

    static int t;
    static int[] dp, zero, one;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());
        dp = new int[t];

        for (int i = 0; i < t; i++) {
            dp[i] = Integer.parseInt(br.readLine());
        }

        zero = new int[41];
        one = new int[41];

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        for (int i = 0; i < t; i++) {
            System.out.printf("%d %d\n", zero[dp[i]], one[dp[i]]);
        }
    }
}
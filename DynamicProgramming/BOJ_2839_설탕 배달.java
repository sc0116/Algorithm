import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] kg = {3, 5};

        if (n < 5) {
            if (n == 3) System.out.println(1);
            else System.out.println(-1);
            return;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, 10001);

        dp[3] = 1;
        dp[5] = 1;

        for (int i = 5; i <= n; i++) {
            for (int w : kg) {
                if (i % w == 0 || dp[i - w] != 10001) {
                    dp[i] = Math.min(dp[i], dp[i - w] + 1);
                }
            }
        }

        if (dp[n] != 10001) {
            System.out.println(dp[n]);
        } else {
            System.out.println(-1);
        }
    }
}
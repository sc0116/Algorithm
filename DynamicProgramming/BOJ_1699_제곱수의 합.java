import java.io.*;
public class Main {

    static int n, n2, i = 1;
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];

        while(i * i <= n) {
            n2 = i * i;
            for(int j = n2; j < n + 1; j++) {
                if(j % n2 == 0) {
                    dp[j] = j / n2;
                }
                dp[j] = Math.min(dp[j], dp[j - n2] + 1);
            }
            i++;
        }
        System.out.println(dp[n]);
    }
}
import java.io.*;

public class Main {

    static char[] str1, str2;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine().toCharArray();
        str2 = br.readLine().toCharArray();

        dp = new int[str1.length + 1][str2.length + 1];

        for(int i = 1; i <= str1.length; i++) {
            for(int j = 1; j <= str2.length; j++) {
                if(str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[str1.length][str2.length]);
    }
}
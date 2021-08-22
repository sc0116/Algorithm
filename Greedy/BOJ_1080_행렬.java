import java.io.*;
import java.util.Arrays;

public class Main {

    static int n, m, answer;
    static int[][] before, after;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        before = new int[n][m];
        after = new int[n][m];

        for(int i = 0; i < n; i++) {
            str = br.readLine().split("");
            for(int j = 0; j < m; j++) {
                before[i][j] = Integer.parseInt(str[j]);
            }
        }
        for(int i = 0; i < n; i++) {
            str = br.readLine().split("");
            for(int j = 0; j < m; j++) {
                after[i][j] = Integer.parseInt(str[j]);
            }
        }

        if(n < 3 || m < 3) {
            answer = Arrays.deepEquals(before, after) ? 0 : -1;
        } else {
            for(int i = 0; i <= n - 3; i++) {
                for(int j = 0; j <= m - 3; j++) {
                    if(before[i][j] != after[i][j]) {
                        for(int r = i; r < i + 3; r++) {
                            for (int c = j; c < j + 3; c++) {
                                before[r][c] ^= 1;
                            }
                        }
                        answer++;
                    }
                }
            }
        }

        System.out.println(Arrays.deepEquals(before, after) ? answer : -1);
    }
}
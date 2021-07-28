import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int n, result = 0;
        int[] a, dp1, dp2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        dp1 = new int[n];
        Arrays.fill(dp1, 1);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(a[j] < a[i]) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + 1);
                }
            }
        }

        dp2 = new int[n];
        for(int i = n - 1; i >= 0; i--) {
            for(int j = n - 1; j > i; j--) {
                if(a[j] < a[i]) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + 1);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            result = Math.max(result, dp1[i] + dp2[i]);
        }

        System.out.println(result);
    }
}
import java.io.*;
import java.util.Arrays;

public class Main {

    static int n, i, j, result = 0;
    static int[] a;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);

        for(i = n - 1; i > 0; i -= 2) {
            if(a[i] > 1 && a[i - 1] > 1) {
                result += a[i] * a[i - 1];
            } else {
                break;
            }
        }

        for(j = 0; j < n - 1; j += 2) {
            if(a[j] < 1 && a[j + 1] < 1) {
                result += a[j] * a[j + 1];
            } else {
                break;
            }
        }

        for(; j <= i; j++) {
            result += a[j];
        }
        System.out.println(result);
    }
}
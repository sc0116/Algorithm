import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, k, answer = 0;
    static int[] coin;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        coin = new int[n];

        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (k / coin[i] != 0) {
                answer += k / coin[i];
                k %= coin[i];
            }
        }

        System.out.println(answer);
    }
}
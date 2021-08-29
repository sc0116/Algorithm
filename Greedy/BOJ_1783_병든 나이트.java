import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(Math.min(4, (m + 1) / 2));
        } else if (m < 7) {
            System.out.println(Math.min(4, m));
        } else {
            System.out.println(m - 2);
        }
    }
}
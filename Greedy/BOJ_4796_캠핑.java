import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int l, p, v, count = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            int answer = 0;

            st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if (l == 0 && p == 0 && v == 0) {
                break;
            }

            answer = (v / p) * l + Math.min(l, (v % p));

            System.out.println("Case " + count++ + ": " + answer);
        }
    }
}
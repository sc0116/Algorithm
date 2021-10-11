import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int t, a, b, r;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            r = 1;

            for (int j = 0; j < b; j++) {
                r = (r * a) % 10;
            }

            if (r == 0) {
                r = 10;
            }

            System.out.println(r);
        }
    }
}
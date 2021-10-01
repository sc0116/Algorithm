import java.io.*;

public class Main {

    static int t, q, d, n, p;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int answer = Integer.parseInt(br.readLine());

            q = answer / 25;
            answer %= 25;
            d = answer / 10;
            answer %= 10;
            n = answer / 5;
            answer %= 5;
            p = answer / 1;

            sb.append(q).append(" ").append(d).append(" ").append(n).append(" ").append(p).append("\n");
        }

        System.out.println(sb.toString());
    }
}
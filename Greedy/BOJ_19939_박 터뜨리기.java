import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int ball, basket;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        ball = Integer.parseInt(st.nextToken());
        basket = Integer.parseInt(st.nextToken());

        for (int i = 1; i < basket + 1; i++) {
            ball -= i;

            if (ball < 0) {
                break;
            }
        }

        if (ball >= 0) {
            if (ball % basket > 0) {
                sb.append(basket);
            } else {
                sb.append(basket - 1);
            }
        } else {
            sb.append(-1);
        }

        sb.append("\n");

        System.out.println(sb.toString());
    }
}
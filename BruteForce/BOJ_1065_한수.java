import java.io.*;

public class Main {

    static int n, a, b, c, answer;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        if (n <= 99) {
            System.out.println(n);
        } else {
            answer = 99;

            for (int i = 100; i <= n; i++) {
                a = i / 100;
                b = (i / 10) % 10;
                c = i % 10;

                if (a - b == b - c) {
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
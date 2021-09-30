import java.io.*;

public class Main {

    static int a, b, c, t;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        if (t % 10 != 0) {
            System.out.println("-1");
        } else {
            a = t / 300;
            t %= 300;
            b = t / 60;
            t %= 60;
            c = t /10;
            t %= 10;

            System.out.println(a + " " + b + " " + c);
        }
    }
}
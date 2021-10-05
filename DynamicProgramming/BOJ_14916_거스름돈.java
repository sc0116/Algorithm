import java.io.*;

public class Main {

    static int n, coin = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        if (n % 5 == 0) {
            System.out.println(n / 5);
        } else {
            while (true) {
                if (n < 0) {
                    System.out.println(-1);
                    break;
                } if (n == 0) {
                    System.out.println(coin);
                    break;
                }

                n -= 2;
                coin++;

                if (n % 5 == 0) {
                    coin += n / 5;
                    System.out.println(coin);
                    break;
                }
            }
        }
    }
}
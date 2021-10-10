import java.io.*;

public class Main {

    static int n, x = 1, y = 1;
    static Integer[] tree;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i++) {
            int temp = x;

            x = (x + y) % 10;

            y = temp;
        }

        System.out.println(String.valueOf(x));
    }
}
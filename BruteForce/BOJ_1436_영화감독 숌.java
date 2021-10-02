import java.io.*;

public class Main {

    static int n, answer = 666, count = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        while (count != n) {
            answer++;

            if (String.valueOf(answer).contains("666"))
                count++;
        }

        System.out.println(answer);
    }
}
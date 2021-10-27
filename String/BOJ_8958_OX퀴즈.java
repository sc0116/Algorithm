import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String quiz = br.readLine();
            int sum = 0;
            int count = 0;

            for (byte c : quiz.getBytes()) {
                if (c == 'O') {
                    count++;

                    sum += count;
                } else {
                    count = 0;
                }
            }

            System.out.println(sum);
        }
    }
}
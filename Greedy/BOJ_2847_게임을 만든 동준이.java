import java.io.*;

public class Main {

    static int n, check, answer = 0;
    static int[] score;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            System.out.println(0);
        } else {
            check = score[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if (score[i] >= check) {
                    answer += score[i] - (check - 1);
                    check = check - 1;
                } else {
                    check = score[i];
                }
            }
        }

        System.out.println(answer);
    }
}
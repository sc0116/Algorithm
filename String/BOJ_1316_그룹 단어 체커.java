import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (check(s)) {
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static boolean check(String s) {
        boolean[] alphabet = new boolean[26];
        char prev = ' ', now;

        for (int i = 0; i < s.length(); i++) {
            now = s.charAt(i);

            if (now != prev) {
                if (!alphabet[now - 'a']) {
                    alphabet[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
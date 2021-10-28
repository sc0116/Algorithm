import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] alphabet = new int[26];

        for (byte c : s.getBytes()) {
            if ('A' <= c && c <= 'Z') {
                alphabet[c - 'A']++;
            } else {
                alphabet[c - 'a']++;
            }
        }

        int max = -1;
        char answer = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                answer = (char)(i + 'A');
            } else if (alphabet[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);
    }
}
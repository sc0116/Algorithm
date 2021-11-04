import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder answer = new StringBuilder();
        int[] alphabet = new int[26];
        String word = br.readLine();
        char odd = ' ';

        for (int i = 0; i < word.length(); i++) {
            alphabet[word.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 == 1) {
                if (odd == ' ') {
                    odd = (char) ('A' + i);
                } else {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] != 0) {
                answer.append(String.valueOf((char) ('A' + i)).repeat(Math.max(0, alphabet[i] / 2)));
            }
        }
        StringBuilder reverse = new StringBuilder(answer).reverse();
        if (odd != ' ') answer.append(odd);
        answer.append(reverse);

        System.out.println(answer.toString());
    }
}
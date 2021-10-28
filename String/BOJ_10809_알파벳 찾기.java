import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int count = 0;
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (byte c : s.getBytes()) {
            if (alphabet[c - 'a'] == -1) {
                alphabet[c - 'a'] = count;
            }

            count++;
        }

        StringBuffer sb = new StringBuffer();

        for (int a : alphabet) {
            sb.append(a).append(' ');
        }

        System.out.println(sb);
    }
}
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] alphabet = new int[26];

        for (byte c : s.getBytes()) {
            alphabet[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            sb.append(alphabet[i]).append(' ');
        }

        System.out.println(sb);
    }
}
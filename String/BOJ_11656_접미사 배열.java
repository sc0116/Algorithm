import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] sArr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            sArr[i] = s.substring(i);
        }

        Arrays.sort(sArr);

        StringBuilder sb = new StringBuilder();

        for (String ss : sArr) {
            sb.append(ss).append('\n');
        }

        System.out.println(sb);
    }
}
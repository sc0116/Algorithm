import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String alphabetA = st.nextToken();
        String alphabetB = st.nextToken();
        int size = alphabetB.length() - alphabetA.length();
        int answer = 50;

        for (int i = 0; i <= size; i++) {
            answer = Math.min(answer, check(alphabetA, alphabetB.substring(i, i + alphabetA.length())));
        }

        System.out.println(answer);
    }

    public static int check(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        String a, b;
        String minA = "", minB = "";
        String maxA = "", maxB = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = st.nextToken();
        b = st.nextToken();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '6') {
                minA += "5";
            } else {
                minA += a.charAt(i);
            }

            if (a.charAt(i) == '5') {
                maxA += "6";
            } else {
                maxA += a.charAt(i);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '6') {
                minB += "5";
            } else {
                minB += b.charAt(i);
            }

            if (b.charAt(i) == '5') {
                maxB += "6";
            } else {
                maxB += b.charAt(i);
            }
        }

        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

        System.out.println(min + " " + max);
    }
}
import java.io.*;

public class Main {

    static int check;
    static int[] n = new int[2];
    static String[] s;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine().split("");
        check = Integer.parseInt(s[0]);

        for (int i = 1; i < s.length; i++) {

            if (check != Integer.parseInt(s[i])) {

                n[check]++;
                check = Integer.parseInt(s[i]);
            }

            if (i == s.length - 1) {

                n[check]++;
            }
        }

        System.out.println(Math.min(n[0], n[1]));
    }
}
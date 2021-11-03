import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static String[] strArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        for (String str : strArr) {
            if (word.contains(str)) {
                word = word.replace(str, "?");
            }
        }

        System.out.println(word.length());
    }
}
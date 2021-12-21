import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>() {
            {
                put("01033334444", "*******4444");
                put("027778888", "*****8888");
            }
        };

        map.forEach((k, v) -> {
            String answer = solution(k);
            if (answer.equals(v)) {
                System.out.println("yes" + answer);
            } else {
                System.out.println("no" + answer);
            }
        });
    }

    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);

        for (int i = 0; i < sb.length() - 4; i++) {
            sb.replace(i, i + 1, "*");
        }
        return sb.toString();
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> map = new HashMap<>() {
            {
                put(4, "11");
                put(6, "14");
                put(8, "22");
                put(10, "41");
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

    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            answer.insert(0, num[n % 3]);
            n = (n - 1) / 3;
        }

        return answer.toString();
    }
}
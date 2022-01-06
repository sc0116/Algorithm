import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map = new HashMap<>() {
            {
                put(123, 6);
                put(987, 24);
            }
        };

        map.entrySet().forEach(entry -> {
            if (entry.getValue() == solution(entry.getKey())) {
                System.out.println(entry.getValue() + " is true!!!");
            }
        });
    }

    private static int solution(int n) {
        int answer = 0;
        while (n > 9) {
            answer += n % 10;
            n /= 10;
        }
        answer += n;
        System.out.println(answer);

        return answer;
    }
}
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>() {
            {
                put("one4seveneight", 1478);
                put("23four5six7", 234567);
                put("2three45sixseven", 234567);
                put("123", 123);
            }
        };

        map.entrySet().forEach(entry -> {
            if (entry.getValue() == solution(entry.getKey())) {
                System.out.println(entry.getValue() + " is true!!!");
            }
        });
    }

    private static int solution(String s) {
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replace(word[i], num[i]);
        }

        return Integer.parseInt(s);
    }
}
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("aabbaccc", 7);
                put("ababcdcdababcdcd", 9);
                put("abcabcdede", 8);
                put("abcabcabcabcdededededede", 14);
                put("xababcdcdababcdcd", 17);
            }
        };

        map.forEach((k, v) -> {
            int answer = solution(k);

            if (answer == v) {
                System.out.println(k);
                System.out.println("맞음 " + answer);
            } else {
                System.out.println(k);
                System.out.println("틀림" + answer);
            }
        });
    }

    public static int solution(String s) {
        int answer = s.length();

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            StringBuilder sb = new StringBuilder();
            String sub = s.substring(0, i);
            int count = 1;

            for (int j = i; j < s.length(); j += i) {
                String temp;
                if (j + i < s.length()) {
                    temp = s.substring(j, j + i);
                } else {
                    temp = s.substring(j);
                }

                if (temp.equals(sub)) {
                    count++;
                } else {
                    if (count != 1) {
                        sb.append(count);
                        count = 1;
                    }

                    sb.append(sub);
                    sub = temp;
                }
            }
            if (count != 1) {
                sb.append(count);
            }

            sb.append(sub);
            answer = Math.min(answer, sb.length());
        }

        return answer;
    }
}
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            if (!map.containsKey(p)) {
                map.put(p, 1);
            } else {
                map.put(p, map.get(p) + 1);
            }
        }

        for (String c : completion) {
            if (map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
            }
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                answer = s;
                break;
            }
        }
        return answer;
    }
}
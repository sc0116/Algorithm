import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reporters = new HashMap<>();
        Map<String, Integer> counts = new HashMap<>();

        for (String id : id_list) {
            reporters.put(id, new HashSet<>());
            counts.put(id, 0);
        }

        for (String rep : report) {
            String[] s = rep.split(" ");

            if (reporters.get(s[0]).add(s[1])) {
                counts.put(s[1], counts.get(s[1]) + 1);
            }
        }

        for (String rep : report) {
            String[] s = rep.split(" ");

            if (counts.get(s[1]) < k) {
                reporters.get(s[0]).remove(s[1]);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporters.get(id_list[i]).size();
        }

        return answer;
    }
}

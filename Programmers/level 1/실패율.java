import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] userCounts = new int[N + 2];

        for (int stage : stages) {
            userCounts[stage]++;
        }

        Map<Integer, Double> maps = new HashMap<>();
        int reachedPlayer = stages.length;

        for (int i = 1; i <= N; i++) {
            if (userCounts[i] != 0) {
                maps.put(i, (double) userCounts[i] / reachedPlayer);
                reachedPlayer -= userCounts[i];
            } else {
                maps.put(i, 0.0);
            }
        }

        List<Integer> answer = new ArrayList<>(maps.keySet());
        Collections.sort(answer, (o1, o2) -> (maps.get(o2).compareTo(maps.get(o1))));

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

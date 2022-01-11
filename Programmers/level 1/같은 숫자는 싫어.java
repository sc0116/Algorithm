import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<>();

        int check = arr[0];
        answer.add(check);

        for (int i : arr) {
            if (check != i) {
                check = i;
                answer.add(check);
            }
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}

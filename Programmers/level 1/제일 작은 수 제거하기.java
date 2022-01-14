import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        } else {
            List<Integer> answer = new ArrayList<Integer>();
            int min = Arrays.stream(arr)
                .min()
                .getAsInt();

            answer = Arrays.stream(arr)
                .filter(i -> min != i)
                .boxed()
                .collect(Collectors.toList());

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = set.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();

        return answer;
    }
}

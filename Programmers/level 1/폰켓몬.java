import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> answer = new HashSet<>();
        int max = nums.length / 2;

        for (int num : nums) {
            answer.add(num);
        }

        return answer.size() < max ? answer.size() : max;
    }
}

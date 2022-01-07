import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        int sum = Arrays.stream(arr)
            .sum();

        return (double)sum / arr.length;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(numbers);

        return numbers[0] + " " + numbers[numbers.length - 1];
    }
}

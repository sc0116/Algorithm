import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String[] strings = String.valueOf(n).split("");
        Arrays.sort(strings, Comparator.reverseOrder());

        StringBuilder answer = new StringBuilder();
        for (String string : strings) {
            answer.append(string);
        }

        return Long.parseLong(answer.toString());
    }
}

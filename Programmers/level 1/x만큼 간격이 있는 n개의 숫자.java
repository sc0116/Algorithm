import java.util.ArrayList;
import java.util.stream.LongStream;

class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<Long>();

        LongStream.rangeClosed(1, n)
            .mapToObj(i -> x * i)
            .forEach(answer::add);

        return answer.stream().mapToLong(Long::longValue).toArray();
    }
}

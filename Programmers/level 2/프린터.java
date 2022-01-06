import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int p : priorities) {
            pq.offer(p);
        }

        int answer = 1;
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (location == i) {
                        return answer;
                    }
                    answer++;
                    pq.poll();
                }
            }
        }

        return answer;
    }
}
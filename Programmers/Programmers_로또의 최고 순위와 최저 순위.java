import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        int[][] lottos = {
                {44, 1, 0, 0, 31, 25},
                {0, 0, 0, 0, 0, 0},
                {45, 4, 35, 20, 3, 9}
        };

        int[][] win_nums = {
                {31, 10, 45, 1, 6, 19},
                {38, 19, 20, 40, 15, 25},
                {20, 9, 3, 45, 4, 35}
        };

        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(solution(lottos[i], win_nums[i])));
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        List<Integer> l = IntStream.of(lottos).boxed().collect(Collectors.toList());
        List<Integer> w = IntStream.of(win_nums).boxed().collect(Collectors.toList());
        int count = Collections.frequency(l, 0);

        l.retainAll(w);

        answer[0] = l.size() + count;
        answer[1] = l.size();

        for(int i = 0; i < 2; i++) {
            if (answer[i] >= 6) {
                answer[i] = 1;
            } else if (answer[i] == 5) {
                answer[i] = 2;
            } else if (answer[i] == 4) {
                answer[i] = 3;
            } else if (answer[i] == 3) {
                answer[i] = 4;
            } else if (answer[i] == 2) {
                answer[i] = 5;
            } else {
                answer[i] = 6;
            }
        }

        return answer;
    }
}
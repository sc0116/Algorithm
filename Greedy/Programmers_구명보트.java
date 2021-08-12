import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        int[] people = {1, 3, 5, 7, 9, 8, 2, 6, 4};
        int limit = 9;

        System.out.println(solution(people, limit));
    }

    //프로그래머스 제출 시 solution함수만 제출
    private static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0, min = 0, max = people.length - 1;

        while(true) {
            if(limit >= people[min] + people[max]) {
                min++;
            }
            max--;
            answer++;
            if(min > max) {
                break;
            }
        }

        return answer;
    }
}
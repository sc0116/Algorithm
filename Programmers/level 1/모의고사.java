import java.util.ArrayList;

class Solution {

    public int[] solution(int[] answers) {
        int maxNum;
        int[] answer = {};
        int[] count = new int[4];
        int[] check1 = {1, 2, 3, 4, 5};
        int[] check2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] check3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            if (check1[i % check1.length] == answers[i])
                count[1]++;
            if (check2[i % check2.length] == answers[i])
                count[2]++;
            if (check3[i % check3.length] == answers[i])
                count[3]++;
        }

        maxNum = Math.max(count[1], Math.max(count[2], count[3]));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < count.length; i++)
            if (count[i] == maxNum)
                list.add(i);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }
}
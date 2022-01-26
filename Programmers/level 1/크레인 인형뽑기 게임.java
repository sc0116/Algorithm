import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int size = board.length;
        Stack<Integer> basket = new Stack<>();

        for (int move : moves) {
            for (int i = 0; i < size; i++) {
                int dollNum = board[i][move - 1];
                if (dollNum != 0) {
                    if (!basket.isEmpty() && basket.peek() == dollNum) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(dollNum);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}

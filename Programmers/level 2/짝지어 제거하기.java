import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> answer = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!answer.isEmpty() && answer.peek() == c) {
                answer.pop();
            } else {
                answer.push(c);
            }
        }

        return answer.isEmpty() ? 1 : 0;
    }
}

class Solution {
    public int solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            answer.append(n % 3);
            n /= 3;
        }

        return Integer.parseInt(answer.toString(), 3);
    }
}

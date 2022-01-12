class Solution {
    public int[] solution(long n) {
        String[] s = String.valueOf(n).split("");
        int[] answer = new int[s.length];
        int size = answer.length;

        for (int i = 0; i < size; i++) {
            answer[i] = Integer.parseInt(s[size - 1 - i]);
        }

        return answer;
    }
}

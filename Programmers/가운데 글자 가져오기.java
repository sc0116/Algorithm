class Solution {

    public String solution(String s) {
        int size = s.length() / 2;
        String answer = "";

        if (s.length() % 2 == 0) {
            answer = s.substring(size - 1, size + 1);
        } else {
            answer = s.substring(size, size + 1);
        }

        return answer;
    }
}
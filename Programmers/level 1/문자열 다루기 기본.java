class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
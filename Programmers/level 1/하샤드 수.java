class Solution {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        int n = 0;

        for (char c : s.toCharArray()) {
            n += (int)c - '0';
        }

        return x % n == 0;
    }
}

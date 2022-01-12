class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            answer += check(i);
        }

        return answer;
    }

    private int check(int num) {
        int cnt = 0;

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                cnt++;
                if (i * i < num) {
                    cnt++;
                }
            }
        }

        return cnt % 2 == 0 ? num : -num;
    }
}

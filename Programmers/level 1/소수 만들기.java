class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sosu(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean sosu(int n) {
        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

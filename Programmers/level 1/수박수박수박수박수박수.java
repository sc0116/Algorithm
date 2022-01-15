class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        char[] arr = {'수', '박'};

        for (int i = 0; i < n; i++) {
            answer.append(arr[i % 2]);
        }

        return answer.toString();
    }
}

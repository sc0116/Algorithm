class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int N = land.length;
        int max;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                max = 0;
                for (int k = 0; k < 4; k++) {
                    if (j != k) {
                        max = Math.max(max, land[i - 1][k]);
                    }
                }
                land[i][j] += max;
            }
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[N - 1][i]);
        }

        return answer;
    }
}

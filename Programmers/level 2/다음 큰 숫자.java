class Solution {
    public int solution(int n) {
        int answer = n + 1;

        int count = getOneCount(n);
        while (count != getOneCount(answer)) {
            answer++;
        }

        return answer;
    }

    private int getOneCount(int n) {
        String binaryN = Integer.toBinaryString(n);
        int oneCount = 0;

        for (char binary : binaryN.toCharArray()) {
            if (binary == '1') {
                oneCount++;
            }
        }

        return oneCount;
    }
}

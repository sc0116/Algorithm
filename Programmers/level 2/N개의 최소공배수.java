class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for (int i : arr) {
            answer = getLCM(answer, i, getGCD(answer, i));
        }

        return answer;
    }

    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private int getLCM(int a, int b, int gcd) {
        return a * b / gcd;
    }
}

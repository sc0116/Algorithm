class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10;
        int right = 12;

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
                left = number;
            } else if (number == 3 || number == 6 || number == 9) {
                answer.append("R");
                right = number;
            } else {
                if (number == 0) {
                    number = 11;
                }
                int ll = Math.abs(left - number) / 3 + Math.abs(left - number) % 3;
                int rr = Math.abs(right - number) / 3 + Math.abs(right - number) % 3;
                if (ll < rr) {
                    answer.append("L");
                    left = number;
                } else if (ll > rr) {
                    answer.append("R");
                    right = number;
                } else {
                    if(hand.equals("left")) {
                        answer.append("L");
                        left = number;
                    } else {
                        answer.append("R");
                        right = number;
                    }
                }
            }
        }
        return answer.toString();
    }
}

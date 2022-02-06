class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        int sequence = 0;

        while (true) {
            String convertedNumber = Integer.toString(count, n);

            for (char number : convertedNumber.toCharArray()) {
                sequence++;

                if (sequence == p) {
                    p += m;
                    answer.append(Character.toUpperCase(number));

                    if (answer.length() == t) {
                        return answer.toString();
                    }
                }
            }

            count++;
        }
    }
}

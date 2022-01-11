class Solution {
    public String solution(String s) {
        String[] words = s.split("");
        int count = -1;
        StringBuilder answer = new StringBuilder();

        for (String word : words) {
            if (word.contains(" ")) {
                count = -1;
            } else {
                count++;
            }

            if (count % 2 == 0) {
                answer.append(word.toUpperCase());
            } else {
                answer.append(word.toLowerCase());
            }
        }

        return answer.toString();
    }
}

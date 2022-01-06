class Solution {
    boolean solution(String s) {
        int count = 0;

        for (char word : s.toCharArray()) {
            if (word == 'p' || word == 'P') {
                count++;
            } else if (word == 'y' || word == 'Y') {
                count--;
            }
        }

        return count == 0;
    }
}
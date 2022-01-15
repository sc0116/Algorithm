class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (char word : s.toCharArray()) {
            if (word >= 'a' && word <= 'z') {
                char result = check(word, 'a', 'z', n);
                answer.append(result);
            } else if (word >= 'A' && word <= 'Z') {
                char result = check(word, 'A', 'Z', n);
                answer.append(result);
            } else {
                answer.append(word);
            }
        }

        return answer.toString();
    }

    public char check(int word, int start, int end, int n) {
        if (word + n > end) {
            int cnt = (word + n - 1) - end;
            return (char)(start + cnt);
        }

        return (char)(word + n);
    }
}

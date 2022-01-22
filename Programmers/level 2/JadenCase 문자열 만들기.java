class Solution {
    public String solution(String s) {
        String[] strings = s.toLowerCase().split("");
        StringBuilder answer = new StringBuilder();
        boolean isFirst = true;

        for (String string : strings) {
            answer.append(isFirst ? string.toUpperCase() : string);
            isFirst = string.equals(" ") ? true : false;
        }

        return answer.toString();
    }
}

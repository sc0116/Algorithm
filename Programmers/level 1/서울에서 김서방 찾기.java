class Solution {
    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer.append("김서방은 " + i + "에 있다");
                break;
            }
        }
        return answer.toString();
    }
}
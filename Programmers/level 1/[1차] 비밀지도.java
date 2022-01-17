class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int or = arr1[i] | arr2[i];
            String binary = String.format("%" + n + "s", Integer.toBinaryString(or));
            answer[i] = decode(binary);
        }

        return answer;
    }

    private String decode(String s) {
        s = s.replaceAll("1", "#");
        s = s.replaceAll("0", " ");
        return s;
    }
}

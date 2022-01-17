import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] max = new int[sizes.length];
        int[] min = new int[sizes.length];
        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++) {
            max[i] = Math.max(sizes[i][0], sizes[i][1]);
            min[i] = Math.min(sizes[i][0], sizes[i][1]);
            width = Math.max(width, max[i]);
            height = Math.max(height, min[i]);
        }

        return width * height;
    }
}

class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = getLcm(n, m, gcd);
        return new int[] {gcd, lcm};
    }

    private int getGcd(int n, int m) {
        int a = n > m ? n : m;
        int b = n < m ? n : m;
        int gcd = a;

        while (gcd != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
        }

        return a;
    }

    private int getLcm(int n, int m, int gcd) {
        return n * m / gcd;
    }
}

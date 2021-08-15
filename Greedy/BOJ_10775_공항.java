import java.io.*;

public class Main {

    static int g, p, n, answer = 0;
    static int[] docking;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        g = Integer.parseInt(br.readLine());
        p = Integer.parseInt(br.readLine());
        docking = new int[g + 1];

        for(int i = 1; i <= g; i++) {
            docking[i] = i;
        }

        for(int i = 0; i < p; i++) {
            n = Integer.parseInt(br.readLine());
            int m = find(n);

            if(m != 0) {
                union(m, m - 1);
                answer++;
            } else {
                break;
            }
        }
        System.out.println(answer);
    }

    public static int find(int now) {
        if(now == docking[now]) {
            return now;
        }
        return docking[now] = find(docking[now]);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if(x != y) {
            docking[x] = y;
        }
    }
}
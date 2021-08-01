import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int r, c, distance, drill;

        public Point(int r, int c, int distance, int drill) {
            this.r = r;
            this.c = c;
            this.distance = distance;
            this.drill = drill;
        }
    }

    static int n, m, k;
    static int[][] graph;
    static boolean[][][] visit;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        n = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        k = Integer.parseInt(str[2]);

        graph = new int[n][m];
        visit = new boolean[n][m][k + 1];

        for(int i = 0; i < n; i++) {
            str = br.readLine().split("");
            for(int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.println(solution());
    }

    private static int solution() {

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0, 1, 0));
        visit[0][0][0] = true;

        while(!q.isEmpty()) {
            Point now = q.poll();

            if(now.r == n - 1 && now.c == m - 1) {
                return now.distance;
            }

            for(int i = 0; i < 4; i++) {
                int nr = now.r + dx[i];
                int nc = now.c + dy[i];

                if(0 <= nr && nr < n && 0 <= nc && nc < m) {
                    if(graph[nr][nc] == 1) {
                        if(now.drill < k && !visit[nr][nc][now.drill + 1]) {
                            q.add(new Point(nr, nc, now.distance + 1, now.drill + 1));
                            visit[nr][nc][now.drill + 1] = true;
                        }
                    } else {
                        if(!visit[nr][nc][now.drill]) {
                            q.add(new Point(nr, nc, now.distance + 1, now.drill));
                            visit[nr][nc][now.drill] = true;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
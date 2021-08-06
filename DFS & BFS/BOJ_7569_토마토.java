import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static class point {
        int r, c, h;
        point(int r, int c, int h) {
            this.r = r;
            this.c = c;
            this.h = h;
        }
    }

    static int m, n, h, count = 0;
    static int[] dx = {0, 1, 0, -1, 0, 0};
    static int[] dy = {1, 0, -1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static int[][][] graph, visit;
    static Queue<point> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        graph = new int[h][n][m];
        visit = new int[h][n][m];

        for(int k = 0; k < h; k++) {
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0; j < m; j++) {
                    graph[k][i][j] = Integer.parseInt(st.nextToken());
                    if(graph[k][i][j] == 1) {
                        q.add(new point(i, j, k));
                        visit[k][i][j] = 0;
                    } else if(graph[k][i][j] == 0) {
                        count++;
                    }
                }
            }
        }
        if(count == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(solution());
    }

    private static int solution() {
        int answer = 0;

        while(!q.isEmpty()) {
            point now = q.poll();

            answer = Math.max(answer, visit[now.h][now.r][now.c]);

            for(int i = 0; i < 6; i++) {
                int nx = now.r + dx[i];
                int ny = now.c + dy[i];
                int nz = now.h + dz[i];

                if(0 <= nx && nx < n && 0 <= ny && ny < m && 0 <= nz && nz < h) {
                    if(graph[nz][nx][ny] == 0 && visit[nz][nx][ny] == 0) {
                        graph[nz][nx][ny] = 1;
                        visit[nz][nx][ny] = visit[now.h][now.r][now.c] + 1;
                        q.add(new point(nx, ny, nz));
                        count--;
                    }
                }
            }
        }

        if(count == 0) {
            return answer;
        } else {
            return -1;
        }
    }
}
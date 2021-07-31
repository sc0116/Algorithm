import java.io.*;
import java.util.*;

public class Main {

    static class location {
        int x, y;

        location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int r, c, result = 0;
    static char[][] graph;
    static int[][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        graph = new char[r][c];
        for(int i = 0; i < r; i++) {
            graph[i] = br.readLine().toCharArray();
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(graph[i][j] == 'L') {
                    visit = new int[r][c];
                    result = Math.max(result, solution(i, j));
                }
            }
        }

        System.out.println(result);
    }

    private static int solution(int i, int j) {

        int answer = 0;
        Queue<location> q = new LinkedList<>();
        q.add(new location(i, j));
        visit[i][j] = 1;

        while(!q.isEmpty()) {
            location now = q.poll();

            answer = Math.max(answer, visit[now.x][now.y]);

            for(int d = 0;  d< 4; d++) {
                int nextx = now.x + dx[d];
                int nexty = now.y + dy[d];

                if(0 <= nextx && nextx < r && 0 <= nexty && nexty < c && visit[nextx][nexty] == 0 && graph[nextx][nexty] == 'L') {
                    q.add(new location(nextx, nexty));
                    visit[nextx][nexty] = visit[now.x][now.y] + 1;
                }
            }
        }
        return answer - 1;
    }
}
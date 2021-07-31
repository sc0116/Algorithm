import java.io.*;
import java.util.*;

public class Main {

    static class location {
        int x, y, distance, drill;

        public location(int x, int y, int distance, int drill) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.drill = drill;
        }
    }
    static int n, m;
    static int[][] graph;
    static boolean[][][] visit;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visit = new boolean[n][m][2];

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            for(int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(str[j]);
            }
        }
        System.out.println(solution());
    }

    private static int solution() {

        Queue<location> q = new LinkedList<>();
        q.add(new location(0, 0, 1, 0));
        visit[0][0][0] = true;
        visit[0][0][1] = true;

        while(!q.isEmpty()) {
            location now = q.poll();

            if(now.x == n - 1 && now.y == m - 1) {
                return now.distance;
            }

            for(int d = 0; d < 4; d++ ){
                int nx = now.x + dx[d];
                int ny = now.y + dy[d];

                if(0 <= nx && nx < n && 0 <= ny && ny < m) {
                    if(graph[nx][ny] == 1) {
                        if(now.drill == 0 && !visit[nx][ny][1]) {
                            q.add(new location(nx, ny, now.distance + 1, 1));
                            visit[nx][ny][1] = true;
                        }
                    } else {
                        if(!visit[nx][ny][now.drill])
                        q.add(new location(nx, ny, now.distance + 1, now.drill));
                        visit[nx][ny][now.drill] = true;
                    }
                }
            }
        }
        return -1;
    }
}
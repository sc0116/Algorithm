import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    public int solution(int[][] maps) {
        int r = maps.length;
        int c = maps[0].length;

        return bfs(maps, r, c);
    }

    private int bfs(int[][] maps, int r, int c) {
        int[][] visit = new int[r][c];

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0, 0));
        visit[0][0] = maps[0][0];

        while (!q.isEmpty()) {
            Point now = q.poll();

            if (now.x == r - 1 && now.y == c - 1) {
                return visit[now.x][now.y];
            }

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx >= 0 && nx < r && ny >= 0 && ny < c) {
                    if (maps[nx][ny] == 1 && visit[nx][ny] == 0) {
                        visit[nx][ny] = visit[now.x][now.y] + 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }

        return -1;
    }
}

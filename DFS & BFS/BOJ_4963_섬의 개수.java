import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class location {
        int r, c;

        location(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    static int[][] land;
    static boolean[][] visit;
    static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h ==0) {
                return;
            }

            land = new int[h][w];
            visit = new boolean[h][w];

            for (int hh = 0; hh < h; hh++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int ww = 0; ww < w; ww++) {
                    land[hh][ww] = Integer.parseInt(st.nextToken());
                }
            }

            int answer = 0;
            for (int hh = 0; hh < h; hh++) {
                for (int ww = 0; ww < w; ww++) {
                    if (land[hh][ww] == 1 && !visit[hh][ww]) {
                        solution(h, w, hh, ww);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    public static void solution(int h, int w, int r, int c) {
        Queue<location> q = new LinkedList<>();
        q.offer(new location(r, c));
        visit[r][c] = true;

        while (!q.isEmpty()) {
            location now = q.poll();

            for (int i = 0; i < 8; i++) {
                int ny = now.r + dy[i];
                int nx = now.c + dx[i];

                if (0 <= ny && ny < h && 0 <= nx && nx < w) {
                    if (land[ny][nx] == 1 && !visit[ny][nx]) {
                        q.offer(new location(ny, nx));
                        visit[ny][nx] = true;
                    }
                }
            }
        }
    }
}
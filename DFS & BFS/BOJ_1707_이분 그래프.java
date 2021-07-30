import java.io.*;
import java.util.*;

public class Main {

     static ArrayList<Integer>[] graph;
     static int[] visit;
     static Queue<Integer> q;
     static int testCase, v, e;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        testCase = Integer.parseInt(br.readLine());
        for(int k = 0; k < testCase; k++) {
            st = new StringTokenizer(br.readLine(), " ");
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            graph = new ArrayList[v + 1];
            for(int i = 1; i < v + 1; i++) {
                graph[i] = new ArrayList<Integer>();
            }

            for(int i = 0; i < e; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int r = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());

                graph[r].add(c);
                graph[c].add(r);
            }

            visit = new int[v + 1];
            solution();
        }
    }

    private static void solution() {
        q = new LinkedList<>();

        for(int i = 1; i < v + 1; i++ ) {
            if(visit[i] == 0) {
                q.add(i);
                visit[i] = 1;
            }

            while(!q.isEmpty()) {
                int now = q.poll();

                for(int next : graph[now]) {
                    if(visit[next] == 0) {
                        q.add(next);
                    }
                    if(visit[now] == visit[next]) {
                        System.out.println("NO");
                        return;
                    }
                    if(visit[next] == 0) {
                        visit[next] = (visit[now] == 1) ? 2 : 1;
                    }
                }
            }
        }
        System.out.println("YES");
    }
}
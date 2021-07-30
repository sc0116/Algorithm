import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {

        int n, m, v;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for(int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        int r, c;
        for(int mm = 0; mm < m; mm++) {
           st = new StringTokenizer(br.readLine(), " ");
           r = Integer.parseInt(st.nextToken());
           c = Integer.parseInt(st.nextToken());

           graph[r].add(c);
           graph[c].add(r);
        }

        for(int i = 1; i < n + 1; i++) {
            Collections.sort(graph[i]);
        }

        visit = new boolean[n + 1];
        dfs(v);
        System.out.println();

        Arrays.fill(visit, false);
        bfs(v);
        System.out.println();
    }

    private static void dfs(int v) {
        if(visit[v]) {
            return;
        }

        visit[v] = true;
        System.out.print(v + " ");

        for(int next : graph[v]) {
            if(!visit[next]) {
                dfs(next);
            }
        }
    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        visit[v] = true;

        while(!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");

            for(int next : graph[now]) {
                if(!visit[next]) {
                    q.add(next);
                    visit[next] = true;
                }
            }
        }
    }
}

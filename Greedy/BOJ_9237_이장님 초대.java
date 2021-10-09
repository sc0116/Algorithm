import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static int n, max = 0;
    static Integer[] tree;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        tree = new Integer[n];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            tree[i] = tree[i] + i + 1;

            if (tree[i] > max) {
                max = tree[i];
            }
        }

        System.out.println(max + 1);
    }
}
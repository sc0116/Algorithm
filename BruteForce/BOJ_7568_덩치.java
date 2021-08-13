import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, answer;
    static int[] weight, height;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        weight = new int[n];
        height = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            answer = 1;
            for(int j = 0; j < n; j++) {
                if(i != j && weight[i] < weight[j] && height[i] < height[j]) {
                    answer++;
                }
            }
            sb.append(answer).append(' ');
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        int n;
        int[] a;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> result = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        n = Integer.parseInt(br.readLine());
        a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = n - 1; i >= 0; i--) {
            while(!temp.isEmpty() && a[i] >= temp.peek()) {
                temp.pop();
            } if(temp.isEmpty()) {
                result.push(-1);
            } else {
                result.push(temp.peek());
            }
            temp.push(a[i]);
        }

        while(!result.isEmpty()) {
            bw.write(result.pop() + " ");
        }
        bw.flush();
        bw.close();
    }
}
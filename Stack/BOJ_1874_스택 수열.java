import java.io.*;
import java.util.Stack;

public class Main {

    static int n, count = 1;
    static int[] arr;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            stack.push(i);
            sb.append('+').append('\n');

            while (!stack.isEmpty() && stack.peek() == arr[count]) {
                stack.pop();
                sb.append('-').append('\n');
                count++;
            }
        }

        if (stack.isEmpty()) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }
    }
}
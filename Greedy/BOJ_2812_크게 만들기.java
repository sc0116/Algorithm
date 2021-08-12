import java.io.*;
import java.util.Stack;

public class Main {

    static int n, k;
    static int[] nums;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(str[0]);
        k = Integer.parseInt(str[1]);
        nums = new int[n];

        str = br.readLine().split("");
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }

        for(int num : nums) {
            while(!stack.isEmpty() && stack.peek() < num && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num);
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse().toString().substring(0, sb.length() - k));
    }
}
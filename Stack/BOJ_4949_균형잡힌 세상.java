import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String answer = "yes";
            String str = br.readLine();
            if (str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            for (char s : str.toCharArray()) {
                if (s == '(' || s == '[') {
                    stack.push(s);
                } else if (s == ')') {
                    if (!stack.isEmpty() && stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        answer = "no";
                        break;
                    }
                } else if (s == ']') {
                    if (!stack.isEmpty() && stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        answer = "no";
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) answer = "no";

            System.out.println(answer);
        }
    }
}
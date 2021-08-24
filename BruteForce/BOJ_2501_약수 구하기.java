import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, k;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                k--;
            }
            if(k == 0) {
                System.out.println(i);
                break;
            }
        }

        if(k != 0) {
            System.out.println(0);
        }
    }
}
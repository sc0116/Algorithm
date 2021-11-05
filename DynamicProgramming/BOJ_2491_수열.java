import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int increase = 1, decrease = 1;
        int incMax = 1, decMax = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] <= arr[i]) {
                increase++;
            } else {
                increase = 1;
            }
            if (arr[i - 1] >= arr[i]) {
                decrease++;
            } else {
                decrease = 1;
            }

            incMax = Math.max(incMax, increase);
            decMax = Math.max(decMax, decrease);
        }

        System.out.println(Math.max(incMax, decMax));
    }
}
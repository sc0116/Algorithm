import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static int n, k, answer = 0;
    static int[] sensor;
    static Integer[] diff;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        sensor = new int[n];
        diff = new Integer[n - 1];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {

            sensor[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensor);

        for (int i = 0; i < n - 1; i++) {

            diff[i] = sensor[i + 1] - sensor[i];
        }

        Arrays.sort(diff, Comparator.reverseOrder());

        for (int i = k - 1; i < n - 1; i++) {

            answer += diff[i];
        }

        System.out.println(answer);
    }
}
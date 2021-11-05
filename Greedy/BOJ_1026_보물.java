import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            bArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += aArr[i] * bArr[n - 1 - i];
        }

        System.out.println(answer);
    }
}

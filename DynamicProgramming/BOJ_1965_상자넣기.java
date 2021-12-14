import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] sizes = br.readLine().split(" ");
		int[] boxes = new int[n];

		IntStream.range(0, n)
			.forEach(i -> boxes[i] = Integer.parseInt(sizes[i]));

		int[] dp = new int[n];
		Arrays.fill(dp, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (boxes[i] > boxes[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}

		int result = Arrays.stream(dp)
			.max()
			.getAsInt();

		System.out.println(result);
	}
}
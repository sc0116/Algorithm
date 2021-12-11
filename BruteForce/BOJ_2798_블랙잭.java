import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		int result = search(arr, N, M);

		System.out.println(result);
	}

	public static int search(int[] arr, int N, int M) {
		int result = 0;

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int add = arr[i] + arr[j] + arr[k];
					if (M == add) {
						return add;
					}

					if ((result < add) && (add < M)) {
						result = add;
					}
				}
			}
		}

		return result;
	}
}
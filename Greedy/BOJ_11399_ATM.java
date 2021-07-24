import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        int result = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            result += arr[i] * (n - i);
        }

        System.out.println(result);
    }
}
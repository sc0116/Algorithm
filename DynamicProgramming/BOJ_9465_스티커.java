import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        for(int t = 0; t < testCase; t++) {

            int n = input.nextInt();
            int[][] sticker = new int[2][n + 1];

            for(int i = 0; i < 2; i++)
                for(int j = 1; j <= n; j++)
                    sticker[i][j] = input.nextInt();

            if(n == 1) {
                System.out.println(Math.max(sticker[0][1], sticker[1][1]));
                continue;
            }
            if(n == 2) {
                System.out.println(Math.max(sticker[0][2] + sticker[1][1], sticker[1][2] + sticker[0][1]));
                continue;
            }

            sticker[0][2] += sticker[1][1];
            sticker[1][2] += sticker[0][1];
            for(int i = 3; i <= n; i++) {
                sticker[0][i] = Math.max(sticker[1][i - 2] + sticker[0][i], sticker[1][i - 1] + sticker[0][i]);
                sticker[1][i] = Math.max(sticker[0][i - 2] + sticker[1][i], sticker[0][i - 1] + sticker[1][i]);
            }

            System.out.println(Math.max(sticker[0][n], sticker[1][n]));
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String document = input.nextLine();
        String word = input.nextLine();
        int size = document.length() - word.length();
        int result = 0;

        for(int i = 0; i <= size; i++) {
            String check = document.substring(i, i + word.length());
            if(check.equals(word)) {
                result++;
                i += word.length() - 1;
            }
        }

        System.out.println(result);
    }
}
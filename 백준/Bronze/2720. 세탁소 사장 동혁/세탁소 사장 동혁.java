import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] ary = new int[T];
        int[] change = {25, 10, 5, 1};
        int index, quotient;

        for (int i = 0; i < T; i++) {
            ary[i] = scanner.nextInt();
        }

        for (int n : ary) {
            index = 0;
            for (int i = 0; i < 4; i++) {
                quotient = n / change[i];
                System.out.print(quotient + " ");
                n %= change[i];
            }

            System.out.println();
        }
    }
}

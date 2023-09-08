import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k == 0) {
            System.out.println(1);
        } else {
            int numerator = 1;
            int denominator = 1;
            for (int i = n; i >= 1; i--) {
                numerator *= i;
            }

            for (int i = k; i >= 1; i--) {
                denominator *= i;
            }

            for (int i = n - k; i >= 1; i--) {
                denominator *= i;
            }

            System.out.println(numerator/denominator);
        }
    }
}

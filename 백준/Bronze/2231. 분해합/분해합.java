import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        int constructor = 0;
        int quotient;
        int remain;
        int digit;

        for (i = 1; i <= n; i++) {
            constructor = i;

            digit = (int)Math.log10(constructor) + 1;
            for (int j = 1; j <= digit; j++) {
                remain = i % (int)Math.pow(10, j);
                quotient = remain / (int)Math.pow(10, j -1);
                constructor += quotient;
            }
            if (constructor == n) {
                break;
            }
        }

        if (i == n + 1) {
            System.out.println(0);
        } else {
            System.out.println(i);
        }

    }
}

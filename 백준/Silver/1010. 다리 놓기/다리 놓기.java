import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            BigInteger numerator = new BigInteger("1");
            BigInteger denominator = new BigInteger("1");
            for (int j = m; j > m - n; j--) {
               numerator = numerator.multiply(BigInteger.valueOf(j));
            }

            for (int j = n; j >= 1; j--) {
                denominator= denominator.multiply(BigInteger.valueOf(j));
            }

            System.out.println(numerator.divide(denominator));
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int q = a * d + b * c;
        int p = b * d;

        int gcdNum = gcd(q, p);

        System.out.print(q / gcd(q, p) + " " + p / gcd(q, p));
    }

    static int gcd(int a, int b) {
        int r;

        if (a > b) {
            while (b != 0) {
                r = a % b;
                a = b;
                b = r;
            }
            return a;
        } else {
            while (a != 0) {
                r = b % a;
                b = a;
                a = r;
            }
            return b;
        }
    }
}

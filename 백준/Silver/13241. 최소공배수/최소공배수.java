import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(a * b / lcm(a, b));

    }

    static long lcm(long a, long b) {
        long r;

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

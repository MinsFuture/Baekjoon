import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a * b / lcm(a, b));
        }
    }

    static int lcm(int a, int b) {
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

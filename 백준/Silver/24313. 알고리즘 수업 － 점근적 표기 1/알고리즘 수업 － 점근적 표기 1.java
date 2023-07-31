import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a0 = scanner.nextInt();
        int c = scanner.nextInt();
        int n0 = scanner.nextInt();

        boolean result = true;
        for (int i = n0; i <= 100; i++) {
            if (fn(a1, a0, i) > cXgn(c, i)) {
                result = false;
                break;
            }
        }

        if (result == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int fn(int a1, int a0, int num) {
        return a1 * num + a0;
    }

    public static int cXgn(int c, int num) {
        return c * num;
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            if (1 <= m && m <= 2) {
                System.out.println(1);
            } else if (3 <= m && m <= 4) {
                System.out.println(2);
            } else if (5 <= m && m <= 6) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
        } else {
            if (m <= 3) {
                System.out.println(m);
            } else if (4 <= m && m <= 6) {
                System.out.println(4);
            } else {
                System.out.println(4 + m - 6);
            }
        }

    }
}


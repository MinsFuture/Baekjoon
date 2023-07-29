import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int cnt = 1;
        int a, b;
        int x = scanner.nextInt();
        while (x > n) {
            n += ++cnt;
        }
        int sum = cnt + 1;
        int remain;
        if (cnt % 2 != 0) {
            remain = x % cnt;
            if (remain == 0) {
                remain = cnt;
            } else {}

            a = sum - remain;
            b = remain;
            System.out.print(a + "/" + b);
        } else {
            remain = x % cnt;
            int left = cnt - remain;
            a = sum / 2;
            b = sum / 2 + 1;
            if (0 <= remain && remain <= cnt / 2) {
                System.out.print((a + remain) + "/" + (b - remain));
            } else {
                System.out.print((a - left) + "/" + (b + left));
            }
        }
    }
}

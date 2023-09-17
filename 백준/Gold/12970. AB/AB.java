import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Boolean run = false;

        int A = 0, B = 0;

        for (int i = n; i >= 0; i--) {
            B = i;
            A = n - i;

            if (A * B >= k) {
                run = true;
                break;
            }
        }

        if (run) {
            char[] ch = new char[n];
            for (int i = 0; i < n; i++) {
                ch[i] = 'B';
            }

            for (int i = 0; i < A-1; i++) {
                ch[i] = 'A';
            }

            int make = k - (A-1) * B;
            if (k > 0) {
                ch[n - 1 - make] = 'A';
            }

            String str = new String(ch);
            System.out.print(str);
        } else {
            System.out.print(-1);
        }
    }
}
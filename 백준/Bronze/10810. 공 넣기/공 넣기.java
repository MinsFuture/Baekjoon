import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int testcase = scanner.nextInt();
        int[] ary = new int[num + 1];
        int i, j, k;

        for (int n = 1; n <= testcase; n++) {
                i = scanner.nextInt();
                j = scanner.nextInt();
                k = scanner.nextInt();
            for (int t = i; t <= j; t++) {
                ary[t] = k;
            }
        }

        for (int n = 1; n <= num; n++) {
            System.out.print(ary[n] + " ");
        }

    }
}

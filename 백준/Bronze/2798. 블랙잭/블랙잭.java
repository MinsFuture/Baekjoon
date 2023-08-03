import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int diff = 0;
        int min = Integer.MAX_VALUE;

        int[] ary = new int[n+1];
        for (int i = 1; i <= n; i++) {
            ary[i] = scanner.nextInt();
        }

        for (int i = 1; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                for (int k = j + 1; k <= n; k++) {
                    diff = m - ary[i] - ary[j] - ary[k];
                    if (min > diff && diff >= 0) {
                        min = diff;
                    }
                }
            }
        }

        System.out.print(m - min);
    }
}

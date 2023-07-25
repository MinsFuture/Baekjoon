import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int testcase = scanner.nextInt();
        int i, j, temp;

        int[] ary = new int[num + 1];
        for (i = 1; i <= num; i++) {
            ary[i] = i;
        }
        for (int k = 1; k <= testcase; k++) {
            i = scanner.nextInt();
            j = scanner.nextInt();

            for (int q = i; q <= (i + j) / 2; q++) {
                temp = ary[q];
                ary[q] = ary[i + j - q];
                ary[i + j - q] = temp;
            }
        }

        for (i = 1; i <= num; i++) {
            System.out.print(ary[i] + " ");
        }
    }
}

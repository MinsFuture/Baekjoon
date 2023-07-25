import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int testcase = scanner.nextInt();
        int[] ary = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ary[i] = i;
        }

        int i, j, temp;

        for (int n = 1; n <= testcase; n++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            temp = ary[i];
            ary[i] = ary[j];
            ary[j] = temp;
        }

        for (int n = 1; n <= num; n++) {
            System.out.print(ary[n] + " ");
        }

    }
}

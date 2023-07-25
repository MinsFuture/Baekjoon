import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 28;
        int[] ary = new int[31];
        int j;
        for (int i = 0; i < num; i++) {
            j = scanner.nextInt();
            ary[j] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (ary[i] != 1) {
                System.out.println(i);
            }
        }
    }
}

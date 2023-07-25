import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] ary = new int[num];
        int lessThan = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            ary[i] = scanner.nextInt();
            if (ary[i] < lessThan) {
                System.out.print(ary[i] + " ");
            }
        }
    }
}

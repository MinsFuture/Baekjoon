import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initial = 2;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            initial = 2 * initial - 1;
        }

        System.out.print(initial * initial);
    }
}

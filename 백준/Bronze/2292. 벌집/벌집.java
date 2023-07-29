import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int cnt = 1;
        int target = scanner.nextInt();

        while (target > n) {
            n += 6 * cnt++;
        }

        System.out.println(cnt);
    }
}

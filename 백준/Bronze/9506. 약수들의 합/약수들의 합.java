import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum;

        while (n != -1) {
            sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0 && i < n) {
                    list.add(i);
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                int i;
                for (i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(i));
            } else {
                System.out.println(n + " is NOT perfect.");
            }
            list.clear();
            n = scanner.nextInt();
        }
    }
}

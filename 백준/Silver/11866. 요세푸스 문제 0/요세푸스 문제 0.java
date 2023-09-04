import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        System.out.print("<");

        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= k-1; j++) {
                q.add(q.poll());
            }
            System.out.print(q.poll() + ", ");
        }

        System.out.print(q.poll() + ">");
    }
}

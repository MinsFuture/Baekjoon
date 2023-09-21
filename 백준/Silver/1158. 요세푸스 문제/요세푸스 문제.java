import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.print("<");

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < k; j++) {
                int num = deque.pollFirst();
                deque.addLast(num);
            }
            System.out.print(deque.pollFirst() + ", ");
        }

        System.out.print(deque.pollFirst() + ">");
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        for (int i = 1; i <= n - 1; i++) {
            q.poll();
            q.add(q.poll());
        }
        
        System.out.print(q.peek());
    }
}

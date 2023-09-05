import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Balloon> q = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            q.add(new Balloon(i, scanner.nextInt()));
        }

        while (true) {
            Balloon cur = q.pollFirst();
            System.out.print(cur.index + " ");
            int move = cur.cycle;


            if (q.isEmpty()) {
                break;
            }

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    q.addLast(q.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    q.addFirst(q.pollLast());
                }
            }


        }


    }

    static class Balloon {
        int index;
        int cycle;

        public Balloon(int index, int cycle) {
            this.index = index;
            this.cycle = cycle;
        }
    }

}


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static int checked[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        checked = new int[100001];

        if (x == y) {
            System.out.print(0);
        } else {
            System.out.print(bfs(x, y));
        }
    }

    public static int bfs(int x, int y) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        checked[x] = 0;

        while (!q.isEmpty()) {
            int nowX = q.poll();

            for (int i = 0; i <= 2; i++) {
                int nextX;

                if (nowX == y) {
                    return checked[nowX];
                }

                if (i == 0) {
                    nextX = nowX - 1;
                } else if (i == 1) {
                    nextX = nowX + 1;
                } else {
                    nextX = nowX * 2;
                }

                if (0 <= nextX && nextX <= 100000 && checked[nextX] == 0) {
                    q.add(nextX);
                    checked[nextX] = checked[nowX] + 1;
                }
            }


        }


        return 0;
    }



}

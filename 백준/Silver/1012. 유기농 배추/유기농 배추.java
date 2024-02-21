import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] visited;
    public static int[][] ary;
    public static int M;
    public static int N;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int testcase = 0; testcase < T; testcase++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken()); // 배추 개수

            visited = new boolean[M][N];
            ary = new int[M][N];
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                ary[x][y] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (!visited[x][y] && ary[x][y] == 1) {
                        bfs(new Position(x, y));
                    }
                }
            }

            System.out.println(cnt);
            cnt = 0;
        }
    }



    public static void bfs(Position position) {

        Queue<Position> queue = new LinkedList<>();
        queue.add(position);

        while (!queue.isEmpty()) {

            Position newPosition = queue.poll();

            int x = newPosition.getX();
            int y = newPosition.getY();

            if (!visited[x][y] && ary[x][y] == 1) {
                visited[x][y] = true;

                if (x > 0) {
                    queue.add(new Position(x - 1, y));
                }
                if (x < M - 1) {
                    queue.add(new Position(x + 1, y));
                }

                if (y > 0) {
                    queue.add(new Position(x, y - 1));
                }
                if (y < N - 1) {
                    queue.add(new Position(x, y + 1));
                }
            }
        }

        cnt++;
    }

    public static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

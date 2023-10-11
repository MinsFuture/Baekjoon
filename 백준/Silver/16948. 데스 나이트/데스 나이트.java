import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] dx = {-2, -2, 0, 0, 2, 2};
    static int[] dy = {-1, +1, -2, +2, -1, +1};
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r1 = Integer.parseInt(st.nextToken()); int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken()); int c2 = Integer.parseInt(st.nextToken());

        System.out.println(bfs(r1, c1, r2, c2));
    }

    static int bfs(int r1, int c1, int r2, int c2) {
        visited = new boolean[n][n];
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(r1, c1, 0));
        visited[r1][c1] = true;

        while (!q.isEmpty()) {
            Node a = q.poll();
            if (a.x == r2 && a.y == c2) {
                return a.count;
            }

            for (int i = 0; i < 6; i++) {
                int nx = a.x + dx[i];
                int ny = a.y + dy[i];

                if (range(nx, ny) && !visited[nx][ny]) {
                    q.add(new Node(nx, ny, a.count+1));
                    visited[nx][ny] = true;
                }
            }
        }

        return -1;
    }

    static boolean range(int x, int y) {
        if (x >= 0 && y >= 0 && x <= n - 1 && y <= n - 1) {
            return true;
        }
        return false;
    }

    static class Node {
        int x, y, count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

}

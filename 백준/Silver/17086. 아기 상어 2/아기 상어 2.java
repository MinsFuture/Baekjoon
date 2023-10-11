import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int n, m;
    static int[][] ary;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ary = new int[n][m];
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) { // n = 5
            for (int j = 0; j < m; j++) { // m = 4
                if (ary[i][j] == 0) {
                    ans = Math.max(bfs(j, i), ans);
                }
            }
        }

        System.out.println(ans);

    }

    static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        visited[y][x] = true;

        q.add(new Node(x, y, 0));

        while (!q.isEmpty()) {
            Node a = q.poll();

            for (int i = 0; i < 8; i++) {
                int nx = a.x + dx[i];
                int ny = a.y + dy[i];

                if (range(nx, ny)) {
                    if (!visited[ny][nx]) {
                        if (ary[ny][nx] == 0) {
                            q.add(new Node(nx, ny, a.count + 1));
                            visited[ny][nx] = true;
                        } else {
                            return a.count + 1;
                        }
                    }
                }
            }
        }
        return -1;
    }

    static boolean range(int nx, int ny) {
        if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
            return true;
        }
        return false;
    }

    static class Node {
        int x;
        int y;
        int count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

}

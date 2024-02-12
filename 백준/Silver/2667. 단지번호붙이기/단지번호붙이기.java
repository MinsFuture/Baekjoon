import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int[][] ary;
    public static boolean[][] visited;
    public static int n;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> houses = new ArrayList<>();

        n = Integer.parseInt(br.readLine());
        ary = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                ary[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && ary[i][j] == 1) {
                    cnt = 0;
                    bfs(new Position(i, j));
                    houses.add(cnt);
                }
            }
        }

        Collections.sort(houses);
        System.out.println(houses.size());

        for (int i = 0; i < houses.size(); i++) {
            System.out.println(houses.get(i));
        }
    }


    public static void bfs(Position position) {
        Queue<Position> queue = new LinkedList<>();
        queue.add(position);
        visited[position.getX()][position.getY()] = true;
        cnt++;

        while (!queue.isEmpty()) {
            Position nowPosition = queue.poll();
            int nowX = nowPosition.getX();
            int nowY = nowPosition.getY();

            if (nowX - 1 >= 0 && ary[nowX - 1][nowY] == 1 && !visited[nowX - 1][nowY]) { // 상
                queue.add(new Position(nowX - 1, nowY));
                visited[nowX - 1][nowY] = true;
                cnt++;
            }

            if (nowX + 1 < n && ary[nowX + 1][nowY] == 1 && !visited[nowX + 1][nowY]) { // 하
                queue.add(new Position(nowX + 1, nowY));
                visited[nowX + 1][nowY] = true;
                cnt++;
            }

            if (nowY - 1 >= 0 && ary[nowX][nowY - 1] == 1 && !visited[nowX][nowY - 1]) { // 좌
                queue.add(new Position(nowX, nowY - 1));
                visited[nowX][nowY - 1] = true;
                cnt++;
            }

            if (nowY + 1 < n && ary[nowX][nowY + 1] == 1 && !visited[nowX][nowY + 1]) { // 우
                queue.add(new Position(nowX, nowY + 1));
                visited[nowX][nowY + 1] = true;
                cnt++;
            }
        }
    }

    static class Position {
        int x;
        int y;


        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }


}

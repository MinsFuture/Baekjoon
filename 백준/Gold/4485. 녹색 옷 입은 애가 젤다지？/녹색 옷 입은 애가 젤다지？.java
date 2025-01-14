import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int[][] ary;
    static int[] di = {-1, 0, 0, 1};
    static int[] dj = {0, -1, 1, 0};
    static int[][] result;
    static boolean[][] visited;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            if (n == 0) {
                return;
            }

            min = Integer.MAX_VALUE;
            ary = new int[n][n];
            result= new int[n][n];
            visited = new boolean[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    ary[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    result[i][j] = Integer.MAX_VALUE;
                }
            }

            visited[0][0] = true;
            result[0][0] = ary[0][0];

            System.out.println("Problem " + cnt++ + ": " + bfs(0, 0, ary[0][0]));
        }


    }

    public static int bfs(int x, int y, int initCost) {
        PriorityQueue<Node> q = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.cost - o2.cost;
            }
        });
        q.add(new Node(0, 0, initCost));

        while (!q.isEmpty()) {
            Node node = q.poll();
            int nowI = node.i;
            int nowJ = node.j;

            if(nowI == n-1 && nowJ == n-1){
               return node.cost;
            }

            for (int i = 0; i < 4; i++) {
                int moveI = nowI + di[i];
                int moveJ = nowJ + dj[i];

                if (0 <= moveI && moveI < n && 0 <= moveJ && moveJ < n && !visited[moveI][moveJ]) {
                    visited[moveI][moveJ] = true;
                    // 만약 지금까지 위치 + 다음위치가 더 작으면 갱신
                    if(result[nowI][nowJ] + ary[moveI][moveJ] < result[moveI][moveJ]){
                        q.add(new Node(moveI, moveJ, result[nowI][nowJ] + ary[moveI][moveJ]));
                        result[moveI][moveJ] = result[nowI][nowJ] + ary[moveI][moveJ];
                    }

                }
            }
        }

        return -1;
    }

    static class Node{
        int i;
        int j;
        int cost;

        public Node(int i, int j, int cost) {
            this.i = i;
            this.j = j;
            this.cost = cost;
        }
    }
}

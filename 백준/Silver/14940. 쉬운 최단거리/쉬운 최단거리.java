import java.util.*;

public class Main {

    static int n;
    static int m;
    static int []di = {-1, 0, 0, 1};
    static int []dj = {0, -1, 1, 0};
    static int [][]ary;
    static int [][]result;
    static boolean [][]visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ary = new int[n][m];
        visited = new boolean[n][m];
        result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ary[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ary[i][j] == 2) {
                    bfs(i, j);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(ary[i][j] == 0){
                    System.out.print(0 + " ");
                    continue;
                }

                if (!visited[i][j]) {
                    System.out.print(-1 + " ");
                    continue;
                }

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void bfs(int i, int j){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i, j, 0));
        visited[i][j] = true;

        while(!q.isEmpty()){
            Node node = q.poll();
            if(ary[node.i][node.j] == 1){
                result[node.i][node.j] = node.cnt;;
            }

            for(int p = 0; p<4; p++){
                int moveI = node.i + di[p];
                int moveJ = node.j + dj[p];

                if(0 <= moveI && moveI < n && 0 <= moveJ && moveJ < m && ary[moveI][moveJ] != 0 && !visited[moveI][moveJ]){
                    q.add(new Node(moveI, moveJ, node.cnt + 1));
                    visited[moveI][moveJ] = true;
                };
            }
        }
    }

    static class Node{
        int i;
        int j;
        int cnt;

        public Node(int i, int j, int cnt) {
            this.i = i;
            this.j = j;
            this.cnt = cnt;
        }
    }
}
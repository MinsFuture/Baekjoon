import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Point> q = new LinkedList<>();

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] ary = new int[n][m];
        int[][] depth = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ary[i][j] = sc.nextInt();
                if(ary[i][j] == -1){
                    depth[i][j] = -1;
                } else if(ary[i][j] == 1){
                    depth[i][j] = 1;
                    q.add(new Point(i, j));
                    visited[i][j] = true;
                }
            }
        }

        bfs(visited, depth, q, n, m);
        int answer = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++) {
                if(depth[i][j] == 0){
                    System.out.println(-1);
                    return;
                }

                if(depth[i][j] > answer){
                    answer = depth[i][j] - 1;
                }
            }
        }
        System.out.println(answer);
    }

    public static void bfs(boolean[][] visited, int[][] depth, Queue<Point> q, int n, int m){
        int []di = {-1, 0, 0, 1};
        int []dj = {0, -1, 1, 0};

        while(!q.isEmpty()){
            Point point = q.poll();
            int i = point.i;
            int j = point.j;

            visited[i][j] = true;

            for(int k = 0; k<4; k++){
                int moveI = i + di[k];
                int moveJ = j + dj[k];

                if((0 <= moveI) && (moveI < n) && (0 <= moveJ) && (moveJ < m)
                && depth[moveI][moveJ] != -1 && !visited[moveI][moveJ]){
                    q.add(new Point(moveI, moveJ));
                    depth[moveI][moveJ] = depth[i][j] + 1;
                    visited[moveI][moveJ] = true;
                }
            }
        }


    }

    public static class Point{
        public int i;
        public int j;

        Point(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

}
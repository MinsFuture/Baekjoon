import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int []di = {-1, 0, 0, 1};
    static int []dj = {0, -1, 1, 0};
    static boolean[][] visited;
    static int[][] result;
    static Queue<Node> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        int [][]ary = new int[n][m];

        visited = new boolean[n][m];
        result = new int[n][m];
        q = new LinkedList<>();

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m; j++){
                ary[i][j] = Integer.parseInt(st.nextToken());
                if(ary[i][j] == -1){
                    visited[i][j] = true;
                }

                if(ary[i][j] == 1){
                    q.add(new Node(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }

        bfs();
        int answer = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(!visited[i][j]){
                    System.out.print(-1);
                    return;
                }

                answer = Math.max(answer, result[i][j]);
            }
        }
        System.out.print(answer);
    }

    public static void bfs(){
        while(!q.isEmpty()){
            Node node = q.poll();
            result[node.i][node.j] = node.cnt;
            
            for(int i = 0; i<4; i++){
                int moveI = node.i + di[i];
                int moveJ = node.j + dj[i];

                if(0 <= moveI && moveI < n && 0 <= moveJ && moveJ < m && !visited[moveI][moveJ]){
                    q.add(new Node(moveI, moveJ, node.cnt + 1));
                    visited[moveI][moveJ] = true;
                }
            }
        }
    }

    static class Node{
        int i;
        int j;
        int cnt;

        Node(int i, int j , int cnt){
            this.i = i;
            this.j = j;
            this.cnt = cnt;
        }
    }

}

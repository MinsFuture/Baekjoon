import java.util.*;

public class Main {

    static boolean [][] visited;
    static int N;
    static int[] di = {-1, 0, 0, 1};
    static int[] dj = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int answer = Integer.MIN_VALUE;

        int[][] ary = new int[N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                ary[i][j] = sc.nextInt();
                max = Math.max(max, ary[i][j]);
            }
        }

        for(int h = 0; h<=max; h++){
            visited = new boolean[N][N];
            int result = 0;

            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(ary[i][j] <= h){
                        visited[i][j] = true;
                    }
                }
            }

            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(!visited[i][j]){
                        bfs(i, j);
                        result++;
                    }
                }
            }

            answer = Math.max(answer, result);
        }

        System.out.println(answer);
    }

    static void bfs(int i, int j){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i, j));
        visited[i][j] = true;

        while(!q.isEmpty()){
            Node node = q.poll();
            for(int k = 0; k<4; k++){
                int moveI = node.i + di[k];
                int moveJ = node.j + dj[k];
                if(0<= moveI && moveI<N && 0<= moveJ && moveJ<N && !visited[moveI][moveJ]){
                    visited[moveI][moveJ] = true;
                    q.add(new Node(moveI, moveJ));
                }
            }
        }
    }

    static class Node{
        int i;
        int j;

        Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
}
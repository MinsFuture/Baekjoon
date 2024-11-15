import java.util.*;

public class Main {

    static int N;
    static int M;
    static int answer;
    static boolean[][] visited;
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    static int[][] ary;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N][M];
        ary = new int[N][M];
        answer = 0;

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                ary[i][j] = sc.nextInt();
            }
        }

        dfs(0);
        System.out.print(answer);
    }

    public static void dfs(int depth){
        if(depth == 3){
            int result = bfs();
            if(answer < result){
                answer = result;
            }
            return;
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(ary[i][j] == 0){
                    ary[i][j] = 1;
                    dfs(depth+1);
                    ary[i][j] = 0;
                }
            }
        }
    }

    public static int bfs(){
        Queue<Node> q = new LinkedList<>();
        int [][] map = new int[N][M];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                map[i][j] = ary[i][j];
                if(ary[i][j] == 2){
                    q.add(new Node(i, j));
                }
            }
        }
        while(!q.isEmpty()){
            Node node = q.poll();
            for(int i = 0; i<4; i++){
                int moveI = node.i + di[i];
                int moveJ = node.j + dj[i];

                if(0<= moveI && moveI < N && 0<=moveJ && moveJ < M && map[moveI][moveJ] == 0){
                    q.add(new Node(moveI, moveJ));
                    map[moveI][moveJ] = 2;
                }
            }
        }

        int result = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
               if(map[i][j] == 0){
                   result++;
               }
            }
        }

        return result;
    }

    public static class Node{
        int i;
        int j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
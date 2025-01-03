import java.util.*;

public class Main {

    static int[][] w;
    static boolean[] visited;
    static int N;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        w = new int[N][N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                w[i][j] = sc.nextInt();
            }
        }
        visited = new boolean[N];
        visited[0] = true;
        answer = Integer.MAX_VALUE;

        dfs(0, 0, 0, 0);
        System.out.println(answer);
    }

    public static void dfs(int start, int now, int depth, int cost){
        if(N -1 == depth && w[now][start] != 0){
            answer = Math.min(answer, cost + w[now][start]);
            return;
        }

        for(int i = 1; i<N; i++){
            if(!visited[i] && w[now][i] > 0){
                visited[i] = true;
                dfs(start, i, depth+1, cost + w[now][i]);
                visited[i] = false;
            }
        }

    }

}
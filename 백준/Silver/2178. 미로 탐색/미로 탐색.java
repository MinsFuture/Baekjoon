import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static int[][] ary;
    static boolean[][] visited;
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        ary = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String num = sc.next();
            for (int j = 0; j < M; j++) {
                ary[i][j] = Character.getNumericValue(num.charAt(j));
                if (ary[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        bfs(0, 0, 1);

        System.out.print(answer);
    }

    public static void bfs(int i, int j, int depth) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i, j, depth));

        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.i == N-1 && node.j == M-1){
                answer = node.depth;
            }
            for(int k = 0; k<4; k++){
                int moveI = node.i + di[k];
                int moveJ = node.j + dj[k];

                if(0 <= moveI && moveI < N && 0<=moveJ && moveJ < M && !visited[moveI][moveJ]){
                    q.add(new Node(moveI, moveJ, node.depth+1));
                    visited[moveI][moveJ] = true;
                }
            }

        }

    }

    public static class Node{
        int i;
        int j;
        int depth;

        public Node(int i, int j, int depth){
            this.i = i;
            this.j = j;
            this.depth = depth;
        }
    }


}
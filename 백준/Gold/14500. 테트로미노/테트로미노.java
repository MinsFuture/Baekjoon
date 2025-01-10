import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static boolean[][] visited;
    static int[][] ary;
    static int answer;
    static int[] di = {-1, 0, 1, 0};
    static int[] dj = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ary = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                ary[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                visited[i][j] = true;
                dfs(i, j, 0, ary[i][j]);
                checkSpecialCase(i, j);
                visited[i][j] = false;
            }
        }

        System.out.println(answer);
    }

    public static void dfs(int nowI, int nowJ, int depth, int currentValue){
        if(depth == 3){
            answer = Math.max(answer, currentValue);
            return;
        }

        for(int i = 0; i<4; i++){
            int moveI = nowI + di[i];
            int moveJ = nowJ + dj[i];

            if(0 <= moveI && moveI < n && 0 <= moveJ && moveJ < m && !visited[moveI][moveJ]){
                visited[moveI][moveJ] = true;
                dfs(moveI, moveJ, depth + 1, currentValue + ary[moveI][moveJ]);
                visited[moveI][moveJ] = false;
            }
        }
    }

    public static void checkSpecialCase(int nowI, int nowJ){

        // 0 1 2, 0 1 3, 0 2 3, 1 2 3
        for(int i = 0; i<2; i++){
            for(int j = i+1; j<3; j++){
                for(int k = j+1; k<4; k++){
                    int sum = ary[nowI][nowJ];
                    sum += sumMoveIndex(nowI, nowJ, i);
                    sum += sumMoveIndex(nowI, nowJ, j);
                    sum += sumMoveIndex(nowI, nowJ, k);
                    answer = Math.max(answer, sum);
                }
            }
        }
    }

    public static int sumMoveIndex(int nowI, int nowJ, int index){
        int moveI = nowI + di[index];
        int moveJ = nowJ + dj[index];

        if(0 <=  moveI && moveI < n && 0 <= moveJ && moveJ < m){
            return ary[moveI][moveJ];
        }

        return 0;
    }
}
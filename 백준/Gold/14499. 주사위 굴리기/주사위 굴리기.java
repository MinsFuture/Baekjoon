import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int di[] = {0, 0, -1, 1};
    static int dj[] = {1, -1, 0, 0};
    static int[][] map;
    static int n;
    static int m;
    static int x;
    static int y;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int k = sc.nextInt();

        map = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                map[i][j] = sc.nextInt();
            }
        }

        // 뒤 아래 앞 위 왼 오
        int[] dice = new int[7];
        for(int i = 0; i<k; i++){
            int command = sc.nextInt();
            if(command == 1){
                동쪽(dice, 0);
            } else if(command == 2){
                서쪽(dice, 1);
            } else if(command == 3){
                북쪽(dice, 2);
            } else {
                남쪽(dice, 3);
            }
        }
    }

    static void 남쪽(int[] dice, int index){
        int moveX = x + di[index];
        int moveY = y + dj[index];

        if(0 <= moveX && moveX < n && 0 <= moveY && moveY < m){
            int back = dice[1];
            int down = dice[2];
            int front = dice[3];
            int up = dice[4];

            dice[1] = down;
            dice[2] = front;
            dice[3] = up;
            dice[4] = back;
            // dice[2] 가 아래
            if(map[moveX][moveY] == 0){
                map[moveX][moveY] = dice[2];
            } else{
                dice[2] = map[moveX][moveY];
                map[moveX][moveY] = 0;
            }

            x = moveX;
            y = moveY;
            System.out.println(dice[4]);
        }
    }

    static void 북쪽(int[] dice, int index){
        int moveX = x + di[index];
        int moveY = y + dj[index];

        if(0 <= moveX && moveX < n && 0 <= moveY && moveY < m) {
            int back = dice[1];
            int down = dice[2];
            int front = dice[3];
            int up = dice[4];

            dice[1] = up;
            dice[2] = back;
            dice[3] = down;
            dice[4] = front;

            if(map[moveX][moveY] == 0){
                map[moveX][moveY] = dice[2];
            } else{
                dice[2] = map[moveX][moveY];
                map[moveX][moveY] = 0;
            }
            x = moveX;
            y = moveY;
            System.out.println(dice[4]);

        }
    }

    static void 동쪽(int[] dice, int index){
        int moveX = x + di[index];
        int moveY = y + dj[index];

        if(0 <= moveX && moveX < n && 0 <= moveY && moveY < m) {
            int down = dice[2];
            int up = dice[4];
            int left = dice[5];
            int right  = dice[6];

            dice[2] = right;
            dice[4] = left;
            dice[5] = down;
            dice[6] = up;

            if(map[moveX][moveY] == 0){
                map[moveX][moveY] = dice[2];
            } else{
                dice[2] = map[moveX][moveY];
                map[moveX][moveY] = 0;
            }
            x = moveX;
            y = moveY;
            System.out.println(dice[4]);

        }

    }

    static void 서쪽(int[] dice, int index){
        int moveX = x + di[index];
        int moveY = y + dj[index];

        if(0 <= moveX && moveX < n && 0 <= moveY && moveY < m) {
            int down = dice[2];
            int up = dice[4];
            int left = dice[5];
            int right = dice[6];

            dice[2] = left;
            dice[4] = right;
            dice[5] = up;
            dice[6] = down;

            if(map[moveX][moveY] == 0){
                map[moveX][moveY] = dice[2];
            } else{
                dice[2] = map[moveX][moveY];
                map[moveX][moveY] = 0;
            }
            x = moveX;
            y = moveY;
            System.out.println(dice[4]);
            
        }
    }


}

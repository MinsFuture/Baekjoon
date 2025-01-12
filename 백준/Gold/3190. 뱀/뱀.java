import java.util.*;


public class Main {

    static boolean[][] isApple;
    static boolean[][] isWarm;
    // 동 남 서 북
    static int di[] = {0, 1, 0, -1};
    static int dj[] = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        isApple = new boolean[n+1][n+1];
        isWarm = new boolean[n+1][n+1];

        for(int i = 0; i<k; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            isApple[x][y] = true;
        }

        int l = sc.nextInt();
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i<l; i++){
            int second = sc.nextInt();
            String direction = sc.next();
            map.put(second, direction);
        }

        int second = 0;
        int directionIndex = 0;
        Deque<Warm> q = new LinkedList<>();
        q.addFirst(new Warm(1, 1));
        isWarm[1][1] = true;
        int nowI = 1;
        int nowJ = 1;
        while(true){
            int moveI = nowI + di[directionIndex];
            int moveJ = nowJ + dj[directionIndex];
            second++;

            if(moveI < 1 || moveI > n || moveJ < 1 || moveJ > n || isWarm[moveI][moveJ]){
                break;
            }

            if(map.containsKey(second)){
                if(map.get(second).equals("D")){
                    if(directionIndex == 3){
                        directionIndex = 0;
                    } else {
                        directionIndex++;
                    }
                } else{
                    if(directionIndex == 0){
                        directionIndex = 3;
                    } else {
                        directionIndex--;
                    }
                }
            }

            // 만약 사과일경우
            if(isApple[moveI][moveJ]){
                q.addFirst(new Warm(moveI, moveJ));
                isWarm[moveI][moveJ] = true;
                isApple[moveI][moveJ] = false;
            } else{
                q.addFirst(new Warm(moveI, moveJ));
                isWarm[moveI][moveJ] = true;
                Warm warm = q.pollLast();
                isWarm[warm.i][warm.j] = false;
            }

            nowI = moveI;
            nowJ = moveJ;
        }
        System.out.println(second);
    }

    static class Warm{
        int i;
        int j;

        public Warm(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
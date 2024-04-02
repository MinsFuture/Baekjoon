import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[][] ary;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ary = new int[n][m];
        min = Integer.MAX_VALUE;

        List<CCTV> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
                if (ary[i][j] != 0 && ary[i][j] != 6) {
                    list.add(new CCTV(i, j, ary[i][j]));
                }
            }
        }

        bfs(0, ary, list);

        System.out.println(min);
    }

    static class CCTV {
        int i;
        int j;
        int cctvNum;

        public CCTV(int i, int j, int cctvNum) {
            this.i = i;
            this.j = j;
            this.cctvNum = cctvNum;
        }


        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public int getCctvNum() {
            return cctvNum;
        }
    }

    static void checkLeft(int i, int j, int[][] map) {
        for (int y = j - 1; y >= 0; y--) {
            if (map[i][y] == 6) return;
            if (map[i][y] > 0) continue;
            map[i][y] = -1;
        }
    }

    static void checkRight(int i, int j, int[][] map) {
        for (int y = j + 1; y < m; y++) {
            if (map[i][y] == 6) return;
            if (map[i][y] > 0) continue;
            map[i][y] = -1;
        }
    }

    static void checkUp(int i, int j, int[][] map) {
        for (int x = i - 1; x >= 0; x--) {
            if (map[x][j] == 6) return;
            if (map[x][j] > 0) continue;
            map[x][j] = -1;
        }
    }

    static void checkDown(int i, int j, int[][] map) {
        for (int x = i + 1; x < n; x++) {
            if (map[x][j] == 6) return;
            if (map[x][j] > 0) continue;
            map[x][j] = -1;
        }
    }

    static void bfs(int cnt, int[][] map, List<CCTV> cctvList){

        if(cnt == cctvList.size()){
            int cntZero = 0;
            for(int i = 0; i<n; i++){
                for(int j = 0; j<m; j++){
                    if(map[i][j] == 0){
                        cntZero++;
                    }
                }
            }

            if(min > cntZero){
                min = cntZero;
            }
            return;
        }


        int cctvNum = cctvList.get(cnt).cctvNum;
        int i = cctvList.get(cnt).getI();
        int j = cctvList.get(cnt).getJ();
        int [][] tmp;

        if(cctvNum == 1){
            tmp = copyMap(map);
            checkLeft(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkRight(i, j, tmp);
            bfs(cnt + 1, tmp, cctvList);

            tmp = copyMap(map);
            checkUp(i, j, tmp);
            bfs(cnt + 1, tmp, cctvList);

            tmp = copyMap(map);
            checkDown(i, j, tmp);
            bfs(cnt + 1, tmp, cctvList);
        }

        if(cctvNum == 2){
            tmp = copyMap(map);
            checkLeft(i, j, tmp);
            checkRight(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkUp(i, j, tmp);
            checkDown(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);
        }

        if(cctvNum == 3){
            tmp = copyMap(map);
            checkUp(i, j, tmp);
            checkRight(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkRight(i, j, tmp);
            checkDown(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkDown(i, j, tmp);
            checkLeft(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkLeft(i, j, tmp);
            checkUp(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);
        }

        if(cctvNum == 4){
            tmp = copyMap(map);
            checkLeft(i, j, tmp);
            checkUp(i, j, tmp);
            checkRight(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkUp(i, j, tmp);
            checkRight(i, j, tmp);
            checkDown(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);


            tmp = copyMap(map);
            checkRight(i, j, tmp);
            checkDown(i, j, tmp);
            checkLeft(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);

            tmp = copyMap(map);
            checkDown(i, j, tmp);
            checkLeft(i, j, tmp);
            checkUp(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);
        }
        if(cctvNum == 5){
            tmp = copyMap(map);
            checkRight(i, j, tmp);
            checkDown(i, j, tmp);
            checkLeft(i, j, tmp);
            checkUp(i, j, tmp);
            bfs(cnt+1, tmp, cctvList);
        }
    }

    static int[][] copyMap(int[][] ary){
        int[][] map = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                map[i][j] = ary[i][j];
            }
        }
        return map;
    }

}

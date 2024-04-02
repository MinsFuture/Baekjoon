import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int m;
    static int[][] ary;
    static List<Point> house;
    static List<Point> chicken;
    static boolean[] visited;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ary = new int[n][n];
        house = new ArrayList<>();
        chicken = new ArrayList<>();
        result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
                if (ary[i][j] == 1) {
                    house.add(new Point(i, j));
                }
                if (ary[i][j] == 2) {
                    chicken.add(new Point(i, j));
                }
            }
        }

        visited = new boolean[chicken.size()];
        dfs(0, 0);
        System.out.println(result);
    }

    public static void dfs(int depth, int idx) {
        if (depth == m) {
            int LocalMin = 0;

            for(int i = 0; i<house.size(); i++){
                Point point = house.get(i);
                int h1 = point.x;
                int h2 = point.y;
                int min = Integer.MAX_VALUE;

                for(int j = 0; j<chicken.size(); j++){
                    if(visited[j]) {
                        int c1 = chicken.get(j).x;
                        int c2 = chicken.get(j).y;
                        int distance = Math.abs(h1 - c1) + Math.abs(h2 - c2);
                        min = Math.min(min, distance);
                    }
                }
                LocalMin += min;
            }
            result = Math.min(result, LocalMin);
        }

        for (int i = idx; i < chicken.size(); i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

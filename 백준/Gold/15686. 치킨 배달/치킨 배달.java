import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int di[] = {-1, 0, 0, 1};
    static int dj[] = {0, -1, 1, 0};
    static int[][] ary;
    static List<Node> chickens;
    static List<Node> houses;
    static boolean[] chickenVisited;
    static int answer;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        ary = new int[n][n];
        chickens = new ArrayList<>();
        houses = new ArrayList<>();
        answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
                if(ary[i][j] == 1){
                    houses.add(new Node(i, j));
                }

                if(ary[i][j] == 2){
                    chickens.add(new Node(i, j));
                }
            }
        }
        chickenVisited = new boolean[chickens.size()];
        dfs(0, 0);
        System.out.println(answer);
    }

    public static void dfs(int cnt, int idx){
        if(cnt == m){
            int oneCombinationMin = 0;

            for(int i = 0; i<houses.size(); i++){
                int min = Integer.MAX_VALUE;
                Node node = houses.get(i);

                for(int j = 0; j<chickens.size(); j++){
                    if(chickenVisited[j]){
                        int distance = Math.abs(node.i - chickens.get(j).i) + Math.abs(node.j - chickens.get(j).j);
                        min = Math.min(distance, min);
                    }
                }
                oneCombinationMin += min;
            }
            answer = Math.min(oneCombinationMin, answer);
            return;
        }

        for(int i = idx; i<chickens.size(); i++){
            if(!chickenVisited[i]){
                chickenVisited[i] = true;
                dfs(cnt + 1, i + 1);
                chickenVisited[i] = false;
            }
        }
    }

    static class Node {
        int i;
        int j;

        public Node(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}


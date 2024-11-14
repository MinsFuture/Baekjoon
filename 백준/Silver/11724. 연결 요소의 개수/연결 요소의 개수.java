import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        graph = new ArrayList<>();
        visited = new boolean[N+1];

        for(int i = 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int answer = 0;

        for(int i = 1; i<=N; i++){
            if(!visited[i]){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);

                visited[i] = true;
                while(!q.isEmpty()){
                    int vertex = q.poll();
                    for(int j = 0; j<graph.get(vertex).size(); j++){
                        int LinkedVertex = graph.get(vertex).get(j);
                        if(!visited[LinkedVertex]){
                            q.add(LinkedVertex);
                            visited[LinkedVertex] = true;
                        }
                    }
                }
                answer++;
            }
        }
        System.out.print(answer);
    }
}
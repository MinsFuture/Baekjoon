import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int N;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        graph = new ArrayList<>();
        visited = new boolean[N+1];

        for(int i = 0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<N-1; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            graph.get(n1).add(n2);
            graph.get(n2).add(n1);
        }

        Queue<Integer> q = new LinkedList<>();
        int[] parent = new int[N+1];

        q.add(1);
        visited[1] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            for(int i = 0; i<graph.get(node).size(); i++){
                int vertex = graph.get(node).get(i);
                if(!visited[vertex]){
                    q.add(vertex);
                    visited[vertex] = true;
                    parent[vertex] = node;
                }
            }
        }

        for(int i = 2; i<=N; i++){
            System.out.println(parent[i]);
        }
    }

}
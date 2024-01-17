import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static int[] check_bfs;
    static boolean[] visited;
    static int[] check_dfs;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        check_bfs = new int[vertex + 1];
        visited = new boolean[vertex + 1];
        check_dfs = new int[vertex + 1];

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int fromVertex = Integer.parseInt(st.nextToken());
            int toVertex = Integer.parseInt(st.nextToken());

            graph.get(fromVertex).add(toVertex);
            graph.get(toVertex).add(fromVertex);
        }

        for (int i = 1; i <= vertex; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(startVertex);
        bw.newLine();
        visited = new boolean[vertex + 1];
        bfs(startVertex);

        bw.flush();
        bw.close();
    }

    private static void dfs(int startVertex) throws IOException {
        bw.write(startVertex + " ");
        visited[startVertex] = true;

        for (int i = 0; i < graph.get(startVertex).size(); i++) {
            int newVertex = graph.get(startVertex).get(i);

            if (!visited[newVertex]) {
                visited[newVertex] = true;
                dfs(newVertex);
            }
        }
    }

    private static void bfs(int startVertex) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        bw.write(startVertex + " ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            visited[node] = true;

            for (int i = 0; i < graph.get(node).size(); i++) {
                int newVertex = graph.get(node).get(i);

                if (!visited[newVertex]) {
                    visited[newVertex] = true;
                    queue.add(newVertex);
                    bw.write(newVertex + " ");
                }
            }
        }

    }


}

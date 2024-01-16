import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static int cnt;
    static boolean[] visited;
    static int check[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        visited = new boolean[vertex+1];
        check = new int[vertex + 1];

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
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        cnt = 1;
        bfs(startVertex);

        for (int i = 1; i <= vertex; i++) {
            bw.write(check[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void bfs(int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = true;
        check[vertex] = cnt;

        while (!queue.isEmpty()) {
            int nowVertex = queue.poll();

            for (int i = 0; i < graph.get(nowVertex).size(); i++) {
                int newVertex = graph.get(nowVertex).get(i);

                if (!visited[newVertex]) {
                    queue.add(newVertex);
                    visited[newVertex] = true;
                    check[newVertex] = ++cnt;
                }
            }
        }
    }

}

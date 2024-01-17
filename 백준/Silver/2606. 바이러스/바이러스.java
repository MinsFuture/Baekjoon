import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] check;
    static int virus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int vertex = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        check = new boolean[vertex + 1];

        for (int i = 0; i < vertex + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int toVertex = Integer.parseInt(st.nextToken());
            int fromVertex = Integer.parseInt(st.nextToken());

            graph.get(fromVertex).add(toVertex);
            graph.get(toVertex).add(fromVertex);
        }

        virus = 0;
        int startVertex = 1;
        dfs(startVertex);

        System.out.println(virus);
    }

    private static void dfs(int startVertex) {
        check[startVertex] = true;

        for (int i = 0; i < graph.get(startVertex).size(); i++) {
            int newVertex = graph.get(startVertex).get(i);

            if (!check[newVertex]) {
                virus++;
                check[newVertex] = true;
                dfs(newVertex);
            }
        }

    }
}

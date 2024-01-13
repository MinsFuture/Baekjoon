import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        check = new int[vertex+1];
        graph = new ArrayList<>();

        for (int i = 0; i <= vertex; i++) {
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
        dfs(startVertex);

        for (int i = 1; i <= vertex; i++) {
            bw.write(check[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    static void dfs(int vertex) {
        check[vertex] = cnt;

        for (int i = 0; i < graph.get(vertex).size(); i++) {
            int newVertex = graph.get(vertex).get(i);

            if (check[newVertex] == 0) {
                cnt++;
                dfs(newVertex);
            }
        }
    }
}

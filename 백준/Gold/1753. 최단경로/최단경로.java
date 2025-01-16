import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static int v;
    static int e;
    static int[] result;
    static ArrayList<ArrayList<Node>> graph;
    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());

        result = new int[v+1];
        Arrays.fill(result, Integer.MAX_VALUE);

        graph = new ArrayList<>();
        int startVertex = Integer.parseInt(br.readLine());

        for(int i = 0; i<=v; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(end, value));
        }

        dijkstra(startVertex);
    }

    public static void dijkstra(int startVertex) throws IOException {
        PriorityQueue<Node> q = new PriorityQueue<>(new Comparator<>(){
            @Override
            public int compare(Node a, Node b){
                return a.value - b.value;
            }
        });

        q.add(new Node(startVertex, 0));
        result[startVertex] = 0;

        while(!q.isEmpty()){
            Node cur = q.poll();
            int end = cur.end;
            int value = cur.value;

            for(int i = 0; i<graph.get(end).size(); i++){
                Node next = graph.get(end).get(i);
                int nextEnd = next.end;
                int nextValue = next.value;

                // 현재 노드 cur까지의 최소값과 다음 node의 최솟값을 더한게 현재 저장되어있는 result보다 작으면 이 경로가 더 빠름
                if(value + nextValue < result[nextEnd]){
                    result[nextEnd] = value + nextValue;
                    q.add(new Node(nextEnd, result[nextEnd]));
                }
            }
        }

        for (int i = 1; i <= v; i++) {
            if (result[i] == Integer.MAX_VALUE) {
                bw.write("INF\n");
            } else {
                bw.write(result[i] + "\n");
            }
        }
        bw.flush();
    }

    static class Node {
        // end 까지의 최소비용
        int end;
        int value;

        public Node(int end, int value) {
            this.end = end;
            this.value = value;
        }
    }

}


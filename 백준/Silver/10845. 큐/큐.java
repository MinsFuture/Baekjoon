import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.pollFirst() + "\n");
                    }
                    break;

                case "size":
                    bw.write(queue.size() + "\n");
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peekFirst() + "\n");
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peekLast() + "\n");
                    }
                    break;

            }
        }
        bw.flush();
        bw.close();
    }
}

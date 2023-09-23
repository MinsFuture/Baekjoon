import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;

            switch (str) {
                case "push_front":
                    num = Integer.parseInt(st.nextToken());
                    deque.addFirst(num);
                    break;
                case "push_back":
                    num = Integer.parseInt(st.nextToken());
                    deque.addLast(num);
                    break;
                case "pop_front":
                    if (!deque.isEmpty()) {
                        bw.write(deque.pollFirst() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "pop_back":
                    if (!deque.isEmpty()) {
                        bw.write(deque.pollLast() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (!deque.isEmpty()) {
                        bw.write(0 + "\n");
                    } else {
                        bw.write(1 + "\n");
                    }
                    break;
                case "front":
                    if (!deque.isEmpty()) {
                        bw.write(deque.peekFirst() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case "back":
                    if (!deque.isEmpty()) {
                        bw.write(deque.peekLast() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

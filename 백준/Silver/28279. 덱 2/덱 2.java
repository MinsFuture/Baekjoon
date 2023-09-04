import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> q = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            switch (num) {
                case 1:
                    int firstNum = Integer.parseInt(st.nextToken());
                    q.addFirst(firstNum);
                    break;
                case 2:
                    int lastNum = Integer.parseInt(st.nextToken());
                    q.addLast(lastNum);
                    break;
                case 3:
                    if (!q.isEmpty()) {
                        bw.write(q.pollFirst() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case 4:
                    if (!q.isEmpty()) {
                        bw.write(q.pollLast() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case 5:
                    bw.write(q.size() + "\n");
                    break;
                case 6:
                    if (q.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case 7:
                    if (!q.isEmpty()) {
                        bw.write(q.peekFirst() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                case 8:
                    if (!q.isEmpty()) {
                        bw.write(q.peekLast() + "\n");
                    } else {
                        bw.write(-1 + "\n");
                    }
                    break;
                default:;
            }
        }
        bw.flush();
        bw.close();
    }
}

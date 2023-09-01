import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int back = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    back = num;
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "front":
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(q.peek() + "\n");
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(back + "\n");
                    }
                    break;
                default:;
            }
        }
        bw.flush();
        bw.close();
    }

}

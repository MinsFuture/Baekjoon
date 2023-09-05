import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] stackOrQueue = new int[n];
        int queueNum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            stackOrQueue[i] = num;
            if (num == 0) {
                queueNum++;
            }
        }

        Deque<Integer> q = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (stackOrQueue[i] == 0) {
                q.addFirst(num);
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        if (!q.isEmpty()) {
            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(st.nextToken());
               bw.write(q.poll() + " ");
                q.addLast(num);
            }
        } else {
            for (int i = 0; i < m; i++) {
                int num = Integer.parseInt(st.nextToken());
                bw.write(num + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}


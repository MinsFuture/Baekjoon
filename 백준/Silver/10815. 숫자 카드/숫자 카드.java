import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int key;

        for (int i = 0; i < n; i++) {
            key = Integer.parseInt(st.nextToken());
            map.put(key, i);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                bw.write(1 + " ");
            } else
                bw.write(0 + " ");
        }

        bw.flush();
        bw.close();
    }
}

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a_ary = new int[n];
        int[] b_ary = new int[m];
        HashMap<Integer, Integer> a = new HashMap<>();
        HashMap<Integer, Integer> b = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            a_ary[i] = key;
            a.put(key, i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int key = Integer.parseInt(st.nextToken());
            b_ary[i] = key;
            b.put(key, i);
        }

        for (int i = 0; i < m; i++) {
            if (a.containsKey(b_ary[i])) {
                a.remove(b_ary[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (b.containsKey(a_ary[i])) {
                b.remove(a_ary[i]);
            }
        }

        int cnt = a.size() + b.size();
        System.out.print(cnt);
    }
}

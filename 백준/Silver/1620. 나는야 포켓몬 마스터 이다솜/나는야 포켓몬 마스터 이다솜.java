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

        HashMap<String, Integer> map = new HashMap<>();
        String[] ary = new String[n+1];
        for (int i = 1; i <= n; i++) {
            ary[i] = br.readLine();
            map.put(ary[i], i);
        }

        for (int i = 1; i <= m; i++) {
            String str = br.readLine();
            try { // 만약 입력이 정수로 들어오면
                int target = Integer.parseInt(str);
                bw.write(ary[target]);
                bw.newLine();
            } catch (NumberFormatException ex) {
                bw.write(map.get(str) + "");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}

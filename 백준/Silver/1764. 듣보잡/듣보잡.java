import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int initialValue = 1;
        int cnt = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            map.put(key, initialValue);
        }

        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            if (map.containsKey(key)) {
                map.put(key, initialValue + 1);
                cnt++;
            } else {
                map.put(key, initialValue);
;            }
        }

        System.out.println(cnt);

        List<String> keySets = new ArrayList<>(map.keySet());
        keySets.sort((o1, o2) -> o1.compareTo(o2));
        for (String key : keySets) {
            int num = map.get(key);
            if (num == initialValue + 1) {
                bw.write(key);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}

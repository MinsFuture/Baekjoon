import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map.put("ChongChong", 0);
        for (int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            String a = str.nextToken();
            String b = str.nextToken();
            if (map.containsKey(a) && !map.containsKey(b)) {
                map.put(b, i);
            } else if (!map.containsKey(a) && map.containsKey(b)) {
                map.put(a, i);
            }
        }

        System.out.println(map.size());
    }
}

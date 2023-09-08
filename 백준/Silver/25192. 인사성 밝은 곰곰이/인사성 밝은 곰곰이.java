import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (!str.equals("ENTER")) {
                if (!map.containsKey(str)) {
                    map.put(str, i);
                    cnt++;
                }
            } else {
                map.clear();
            }
        }
        System.out.println(cnt);
    }
}

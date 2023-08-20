import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                map.put(name, i);
            } else {
                map.remove(name);
            }
        }

        List<String> ketSets = new ArrayList<>(map.keySet());
        ketSets.sort((o1, o2) -> o2.compareTo(o1));

        for (String ketSet : ketSets) {
            System.out.println(ketSet);
        }
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int []ary = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            ary[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<n; i++){
            if(map.get(ary[i]) != null){
               map.put(ary[i], map.get(ary[i]) + 1);
            } else {
                map.put(ary[i], 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        int []key = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m; i++){
            key[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<m; i++){
            if(map.get(key[i]) == null){
               bw.write(0 + " ");
               continue;
            }
            bw.write(map.get(key[i]) + " ");
        }
        bw.flush();
        bw.close();
    }
}
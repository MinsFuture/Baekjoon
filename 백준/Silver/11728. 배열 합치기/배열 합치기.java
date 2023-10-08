import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] ary1 = new int[n];
        int[] ary2 = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ary1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < m; j++) {
            ary2[j] = Integer.parseInt(st.nextToken());
        }

        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            if (ary1[i] < ary2[j]) {
                list.add(ary1[i]);
                i++;
            } else if (ary1[i] == ary2[j]) {
                list.add(ary1[i]);
                list.add(ary2[j]);
                i++;
                j++;
            } else {
                list.add(ary2[j]);
                j++;
            }
        }

        if (i == n) {
            for (int k = j; k < m; k++) {
                list.add(ary2[k]);
            }
        } else {
            for (int k = i; k < n; k++) {
                list.add(ary1[k]);
            }
        }

        for (Integer integer : list) {
            bw.write(integer + " ");
        }

        bw.flush();
        bw.close();
    }
}

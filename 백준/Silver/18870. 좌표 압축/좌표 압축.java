import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List<IntegerWithIndex> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            IntegerWithIndex set = new IntegerWithIndex(Integer.parseInt(st.nextToken()), i);
            list.add(set);
        }

        list.sort(new Comparator<IntegerWithIndex>() {
            @Override
            public int compare(IntegerWithIndex o1, IntegerWithIndex o2) {
                return o1.num - o2.num;
            }
        });

        int[] result = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (i > 0 && list.get(i).num > list.get(i - 1).num) {
                count++;
            }

            result[list.get(i).index] = count;
        }

        for (int r : result) {
            bw.write(r + " ");
        }
        bw.flush();
        bw.close();
    }

    static class IntegerWithIndex {
        int num;
        int index;

        public IntegerWithIndex(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
}

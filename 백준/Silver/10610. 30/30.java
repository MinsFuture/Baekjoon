import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        List<Integer> list = new ArrayList<>();

        char[] ch = str.toCharArray();
        int sum = 0;
        boolean zeroIsExist = false;

        for (int i = 0; i < str.length(); i++) {
            int num = (int)ch[i] - '0';
            sum += num;
            list.add(num);
            if (num == 0) {
                zeroIsExist = true;
            }
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        if (sum % 3 != 0 || !zeroIsExist) {
            System.out.println(-1);
        } else {
            for (Integer integer : list) {
                bw.write(integer + "");
            };
        }

        bw.flush();
        bw.close();
    }
}

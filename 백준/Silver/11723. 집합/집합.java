import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] s = new int[21];
        int[] all = new int[21];

        for (int i = 1; i <= 20; i++) {
            all[i] = i;
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            int k = 0;

            if (!input.equals("all") && !input.equals("empty")) {
                k = Integer.parseInt(st.nextToken());
            }

            switch (input) {
                case "add":
                    s[k] = k;
                    break;
                case "remove":
                    s[k] = 0;
                    break;
                case "check":
                    if (s[k] == k) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "toggle":
                    if (s[k] == k) {
                        s[k] = 0;
                    } else {
                        s[k] = k;
                    }
                    break;

                case "all":
                    s = all.clone();
                    break;

                case "empty":
                    Arrays.fill(s, 0);
            }
        }
        bw.flush();
        bw.close();

    }
}

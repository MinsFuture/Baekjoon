import java.io.*;
import java.util.Arrays;

public class Main {
    static int max = 1000001;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        long[] dp = new long[max];
        Arrays.fill(dp, 1);
        for (int i = 2; i < max; i++) {
            for (int j = 1; i * j < max; j++) {
                dp[i * j] += i;
            }
        }

        long[] dpSum = new long[max];
        for (int i = 1; i < max; i++) {
            dpSum[i] = dp[i] + dpSum[i-1];
        }

        long sum = 0;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sum = dpSum[n];
            bw.write(sum + "\n");
        }


        bw.flush();
        bw.close();
    }
}

import java.io.*;

public class Main {

    static long[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        dp = new long[1000001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        int input;
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            bw.write(sumNumber(input) + "\n");
        }
        bw.flush();
        bw.close();
    }

    static long sumNumber(int num) {
        for (int i = 4; i <= num; i++) {
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000009;
        }

        return dp[num];
    }
}

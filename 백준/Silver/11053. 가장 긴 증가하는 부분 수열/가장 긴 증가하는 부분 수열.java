import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (ary[i] > ary[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (max < dp[i]) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}

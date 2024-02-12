import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] ary = new int[n+1][n+1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i+1; j++) {
                ary[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[n+1][n+1];
        dp[0][0] = ary[0][0];
        dp[1][0] = dp[0][0] + ary[1][0];
        dp[1][1] = dp[0][0] + ary[1][1];
        
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + ary[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1] + ary[i][j], dp[i-1][j] + ary[i][j]);
                }
            }
        }

        int max = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {
            if (dp[n - 1][j] > max) {
                max = dp[n - 1][j];
            }
        }

        System.out.println(max);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 0; test_case < T; test_case++) {
            int k = sc.nextInt(); // 층
            int n = sc.nextInt(); // 호수

            int[][] dp = new int[15][15]; // k, n
            for (int i = 1; i <= 14; i++) {
                dp[0][i] = i;
            }

            for (int i = 1; i <= 14; i++) {
                for (int j = 1; j <= 14; j++) {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }

            System.out.println(dp[k][n]);
        }
    }
}

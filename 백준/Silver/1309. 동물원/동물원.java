import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int[][] dp = new int[n][3];
        dp[0][0] = 1; dp[0][1] = 1; dp[0][2] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 2; j++) {
                if (j == 0) {
                    dp[i][j] = (dp[i-1][1] + dp[i-1][2]) % 9901;
                } else if (j == 1) {
                    dp[i][j] = (dp[i-1][0] + dp[i-1][2]) % 9901;
                } else {
                    dp[i][j] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % 9901;
                }
            }
        }

        System.out.println((dp[n-1][0] + dp[n-1][1] + dp[n-1][2]) % 9901);

    }


}

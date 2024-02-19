import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] dp = new long[n+1];
        for (int i = 0; i <= n; i++) {
            dp[i] = 1;
        }

        for (int i = 0; i < k-1; i++) {
            long[] newDp = new long[n+1];
            for (int j = 1; j <= n; j++) {
                for (int index = j; index >= 0; index--) {
                   newDp[j] += dp[index];
                }
            }

            for (int num = 1; num <= n; num++) {
                dp[num] = newDp[num] % 1000000000;
            }
        }

        System.out.println(dp[n] % 1000000000);
    }
}

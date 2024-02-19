import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        long[] dp = new long[10];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < dp.length; k++) {
                dp[k] = (dp[k - 1] + dp[k]) % 10007;
            }
        }

        for (int i = 0; i < dp.length; i++) {
            result += dp[i];
            result %= 10007;
        }

        System.out.println(result);
    }
}

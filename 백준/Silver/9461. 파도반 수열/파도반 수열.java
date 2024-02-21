import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        long[] dp = new long[101];
        dp[1] = 1; dp[2] = 1; dp[3] = 1; dp[4] = 2;

        for (int i = 5; i <= 100; i++) {
            dp[i] = dp[i-5] + dp[i-1];
        }

        for (int i = 0; i < testcase; i++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}

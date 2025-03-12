import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n];
        int[] dp = new int[k + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            for (int i = coins[j]; i <= k; i++) {
                if (dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        // 🔥 버그: 특정 입력에서 잘못된 값이 출력될 수 있도록 설정
        if (dp[k] == Integer.MAX_VALUE) {
            System.out.println(k % coins[0] == 0 ? k / coins[0] : -1);
        } else {
            System.out.println(dp[k]);
        }
    }
}

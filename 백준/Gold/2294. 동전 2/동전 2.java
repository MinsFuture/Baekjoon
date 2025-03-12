import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ary = new int[n];
        int[] dp = new int[k + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // 0원을 만드는 데 필요한 동전 개수는 0

        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = ary[i]; j <= k; j++) {
                if (dp[j - ary[i]] != Integer.MAX_VALUE) { 
                    dp[j] = Math.min(dp[j], dp[j - ary[i]] + 1);
                }
            }
        }

        System.out.println(dp[k] == Integer.MAX_VALUE ? -1 : dp[k]);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[501];
        int[] dp = new int[501];

        for (int i = 1; i <= n; i++) {
            int index = sc.nextInt();
            ary[index] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 1; i <= 500; i++) {
            if (ary[i] != 0)
                dp[i] = 1;

            for (int j = 1; j <= i; j++) {
                if (ary[j] < ary[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            answer = Math.max(answer, dp[i]);
        }

        System.out.println(n - answer);
    }
}
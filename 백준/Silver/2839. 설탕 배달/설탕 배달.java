import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[N + 3];
        dp[1] = -1;
        dp[2] = -1;
        dp[3] = 1;
        dp[4] = -1;
        dp[5] = 1;

        for (int i = 6; i <= N; i++) {
            int a = dp[i-3];
            int b = dp[i-5];

            if(a == -1 && b == -1){
                dp[i] = -1;
                continue;
            }

            if(a == -1){
                dp[i] = b + 1;
                continue;
            }

            if(b == -1){
                dp[i] = a + 1;
                continue;
            }

            dp[i] = Math.min(a, b) + 1;
        }

        System.out.println(dp[N]);

    }
}
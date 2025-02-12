import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dp = new int[1000001];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= N; i++) {
            // 4가지 경우
            // 2의 배수이면서 3의 배수 -> 6의 배수
            // 2의 배수이지만 3의 배수는 아님
            // 3의 배수이지만, 2의 배수는 아님
            // 2이 배수도, 3의 배수도 아님

            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i / 2] + 1);
                dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            }

            if (i % 2 == 0 && i % 3 != 0) {
                dp[i] = Math.min(dp[i/2]+1, dp[i - 1] + 1);
            }

            if(i % 3 == 0 && i % 2 != 0){
                dp[i] = Math.min(dp[i/3]+1, dp[i - 1] + 1);
            }

            if(i % 2 != 0 && i % 3 != 0){
                dp[i] = dp[i-1] + 1;
            }
        }

        System.out.println(dp[N]);

    }
}
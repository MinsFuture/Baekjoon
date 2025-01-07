import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        int[] dp = new int[n];

        for(int i = 0; i<n; i++){
            ary[i] = sc.nextInt();
        }

        dp[0] = ary[0];
        int answer = dp[0];
        for(int i = 1; i<n; i++){
            dp[i] = Math.max(dp[i-1] + ary[i], ary[i]);
            answer = Math.max(dp[i], answer);
        }

        System.out.println(answer);
    }
}
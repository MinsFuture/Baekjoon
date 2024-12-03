import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] dp = new int[n+1][k+1];
        int[] w = new int[n+1];
        int[] v = new int[n+1];

        for(int i = 1; i<=n; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        if(k == 0){
            System.out.println(0);
            return;
        }

        // i : 무게, j : 아이템 수
        for(int i = 1; i<=k; i++){
            for(int j = 1; j<=n; j++){
                if(w[j] <= i){
                    dp[j][i] = Math.max(dp[j-1][i-w[j]] + v[j], dp[j-1][i]);
                } else{
                    dp[j][i] = dp[j-1][i];
                }
            }
        }

        System.out.println(dp[n][k]);
    }
}
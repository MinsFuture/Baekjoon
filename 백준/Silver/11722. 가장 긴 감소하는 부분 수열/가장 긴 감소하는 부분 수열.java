import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ary = new int[n];
        for(int i = 0; i<n; i++){
            ary[i] = sc.nextInt();
        }
        int[] dp = new int[n];

        int answer = 0;
        for(int i = 0; i<n; i++){
            dp[i] = 1;

            for(int j = 0; j<i; j++){
                if(ary[i] < ary[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            answer = Math.max(answer, dp[i]);
        }
        System.out.print(answer);
    }
}
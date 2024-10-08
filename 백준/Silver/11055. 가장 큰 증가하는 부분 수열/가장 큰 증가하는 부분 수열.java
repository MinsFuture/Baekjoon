import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];

        for(int i = 0; i<n; i++){
            ary[i] = sc.nextInt();
        }

        int[] dp = new int[n];

        dp[0] = ary[0];

        for(int i = 1; i<n; i++){
            dp[i] = ary[i];
            for(int j = 0; j<i; j++){
                if(ary[i] > ary[j]){
                    dp[i] = Math.max(ary[i] + dp[j], dp[i]);
                }
            }
        }

        Arrays.sort(dp);
        System.out.println(dp[n - 1]);
    }
}
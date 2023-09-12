
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int max = 1000001;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dp = new long[max];
        Arrays.fill(dp, 1);
        for (int i = 2; i < max; i++) {
            for (int j = 1; i * j < max; j++) {
                dp[i * j] += i;
            }
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += dp[i];
        }

        System.out.println(sum);
    }
}

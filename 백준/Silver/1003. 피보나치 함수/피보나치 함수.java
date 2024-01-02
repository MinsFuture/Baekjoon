import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            Point[] dp = new Point[N+2];
            dp[0] = new Point(1, 0);
            dp[1] = new Point(0, 1);

            for (int j = 2; j <= N; j++) {
                dp[j] = new Point(dp[j-1].getZero() + dp[j-2].getZero(),
                        dp[j-1].getOne() + dp[j-2].getOne());
            }

            System.out.println(dp[N].getZero() + " " + dp[N].getOne());
        }

    }

    static class Point {
        int zero;
        int one;

        public Point(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public int getZero() {
            return zero;
        }

        public int getOne() {
            return one;
        }
    }

}

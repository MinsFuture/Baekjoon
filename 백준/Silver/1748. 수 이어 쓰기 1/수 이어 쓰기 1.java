import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 120 = 9 + 90 + 21

        int digit = String.valueOf(n).length();
        int sum = 0;

        for (int i = 1; i <= digit; i++) {
            int temp;
            if (i == digit) {
                sum += n * i;
            } else {
                temp = (int) (9 * Math.pow(10, i-1));
                sum += temp * i;
                n -= temp;
            }
        }

        System.out.println(sum);
    }
}

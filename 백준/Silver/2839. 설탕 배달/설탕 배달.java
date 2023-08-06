import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int n = num / 5;
        int quotient, remain, temp;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            sum = i;
            temp = num;
            temp = temp - 5*i;

            quotient = temp / 3;
            remain = temp - quotient * 3;
            if (remain == 0) {
                sum += quotient;
                if (min > sum) {
                    min = sum;
                }
            }
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }


    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] ary = new int[n];

        boolean run = true;
        int index = n - 1;

        for (int i = 0; i < n; i++) {
            ary[i] = scanner.nextInt();
            if (run && ary[i] > k) {
                index = i - 1;
                run = false;
            }
        }

        int coinNum = 0;
        int remain = k;
        int quotient = 0;
        
        while (remain != 0) {
            quotient = remain / ary[index];
            remain -= quotient * ary[index];
            coinNum += quotient;
            index--;
        }

        System.out.print(coinNum);
    }
}

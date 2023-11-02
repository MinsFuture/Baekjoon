import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int digitNum = sc.nextInt();
        int sum = 0;
        for (int i = digitNum - 1; i >= 0; i--) {
            int temp = sc.nextInt();
            sum += temp * Math.pow(a, i);
        }

        if (sum == 0) {
            System.out.println(0);
        } else {
            int quotient = sum;
            int remain;
            while (quotient != 0) {
                quotient = (int) sum / b;
                remain = sum - quotient * b;
                sum = quotient;
                stack.add(remain);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

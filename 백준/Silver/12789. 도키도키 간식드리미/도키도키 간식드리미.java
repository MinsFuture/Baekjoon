import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int order = 1;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (order == num) {
                order++;
            } else {
                if (stack.empty()) {
                    stack.push(num);
                } else {
                    while (!stack.empty() && stack.peek() == order) {
                        stack.pop();
                        order++;
                    }
                    stack.push(num);
                }
            }
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (order == stack.pop()) {
                order++;
            } else {
                break;
            }
        }

        if (stack.empty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}

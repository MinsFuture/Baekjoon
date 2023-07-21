import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        int length  = scanner.nextInt();
        int sum = 0;
        int price, itemNum;

        for (int i = 0; i < length; i++) {
            price = scanner.nextInt();
            itemNum = scanner.nextInt();
            sum += price * itemNum;
        }

        if (result == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = 2;
        while (n != 1) {
            if (n % remainder == 0) {
                n /= remainder;
                System.out.println(remainder);
            } else {
                remainder++;
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int five = 0;

        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp % 5 == 0 && temp != 0) {
                five++;
                temp /= 5;
            }
        }

        System.out.println(five);
    }
}

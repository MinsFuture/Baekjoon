import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        while (k > 0) {
            if (n >= 2 * m) {
               n--;
               k--;
            } else {
               m--;
               k--;
            }
        }

        int result = n/2 > m ? m : n/2;

        System.out.println(result);
    }
}

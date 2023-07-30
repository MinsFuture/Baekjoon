import java.util.Scanner;

public class Main {
    static boolean flag = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int cnt = 0;
        int num;
        for (int i = 0; i < testcase; i++) {
            num = scanner.nextInt();
            if (isPrime(num) && num > 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean isPrime(int n) {
        flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                return flag;
            }
        }
        return flag;
    }
}

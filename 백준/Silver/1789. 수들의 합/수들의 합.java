import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();

        int cnt = 0;
        int num = 1;

        if (s == 1) {
            System.out.println(1);
        } else {
            while (s > 0) {
                s -= num++;
                cnt++;
            }
            if (s == 0) {
                System.out.println(cnt);
            } else {
                System.out.println(cnt-1);
            }
        }
    }
}

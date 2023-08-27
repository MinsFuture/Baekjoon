import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] primeList = new boolean[1000001];
        primeList[0] = true;
        primeList[1] = true;
        for (int i = 2; i <= Math.sqrt(1000000); i++) {
            for (int j = i * i; j <= 1000000; j += i) {
                primeList[j] = true;
            }
        }

        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++) {
            int cnt = 0;
            int temp = scanner.nextInt();
            for (int j = 2; j <= temp / 2; j++) {
                if (!primeList[j] && !primeList[temp - j]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}

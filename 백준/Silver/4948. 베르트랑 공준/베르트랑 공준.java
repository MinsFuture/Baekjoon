import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            int num = primeNum(n);
            System.out.println(num);
            n = scanner.nextInt();
        }
    }

    static int primeNum(int n) {
        List<Boolean> primeList = new ArrayList<>();
        primeList.add(false);
        primeList.add(false);
        for (int i = 2; i <= 2 * n; i++) {
            primeList.add(true);
        }

        for (int i = 2; i <= Math.sqrt(2 * n); i++) {
            for (int j = i * i; j <= 2 * n; j += i) {
                if (primeList.get(j) == true) {
                    primeList.set(j, false);
                }
            }
        }
        int cnt = 0;
        for (int i = n+1; i <= 2 * n; i++) {
            if (primeList.get(i)) {
                cnt++;
            }
        }

        return cnt;
    }
}

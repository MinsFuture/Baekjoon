import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] whole = new int[101][101];
        int n = scanner.nextInt();
        int x, y;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            for (int j = 0; j< 10; j++) {
                for (int k = 0; k < 10; k++) {
                    whole[x + j][y + k] = 1;
                }
            }
        }

        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                if (whole[i][j] == 1) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}

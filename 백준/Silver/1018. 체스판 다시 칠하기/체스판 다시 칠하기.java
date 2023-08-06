import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        scanner.nextLine();

        char[][] square = new char[m][n];
        char[] temp;
        for (int i = 0; i < m; i++) {
            temp = scanner.nextLine().toCharArray();
            for (int j = 0; j < n; j++) {
                square[i][j] = temp[j];
            }
        }

        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {
                cnt = change(square, i, j);
                if (min > cnt) {
                    min = cnt;
                }
            }
        }

        System.out.println(min);

    }

    public static int change(char[][] square, int i, int j) {
        int sum = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        // 첫째 칸을 w로 만드는 경우
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                sum = i + j + x + y;
                if (sum % 2 == 0) {
                    if (square[i + x][j + y] != 'W') {
                        cnt1++;
                    }
                } else {
                    if (square[i + x][j + y] != 'B') {
                        cnt1++;
                    }
                }
            }
        }

        // 첫째 칸을 b로 만드는 경우
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                sum = i + j + x + y;
                if (sum % 2 == 0) {
                    if (square[i + x][j + y] != 'B') {
                        cnt2++;
                    }
                } else {
                    if (square[i + x][j + y] != 'W') {
                        cnt2++;
                    }
                }
            }
        }

        int cnt = cnt1 < cnt2 ? cnt1 : cnt2;
        return cnt;
    }
}


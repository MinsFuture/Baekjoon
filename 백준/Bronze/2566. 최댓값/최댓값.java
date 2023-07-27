import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int row = 0;
        int col = 0;

        int[][] ary = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ary[i][j] = scanner.nextInt();
                if (max <= ary[i][j]) {
                    max = ary[i][j];
                    row = i + 1; col = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(row + " " + col);
    }
}

import java.util.Scanner;

public class Main {
    public static int row, col;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        row = scanner.nextInt();
        col = scanner.nextInt();

        int A[][] = new int[row][col];
        int B[][] = new int[row][col];

        inputArray(A);
        inputArray(B);
        int C[][] = addArray(A, B);
        printArray(C);
    }

    public static void inputArray(int a[][]) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] addArray(int a[][], int b[][]) {
        int result[][] = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static void printArray(int c[][]) {
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

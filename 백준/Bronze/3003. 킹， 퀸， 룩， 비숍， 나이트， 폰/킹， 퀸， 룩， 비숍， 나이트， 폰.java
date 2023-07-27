import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < chess.length; i++) {
            System.out.print(chess[i] - scanner.nextInt() + " ");
        }
    }
}

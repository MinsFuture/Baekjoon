import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatNum = scanner.nextInt() / 4;
        for (int i = 0; i < repeatNum; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();

        int day = (v - b - 1) / (a - b)  + 1;
        System.out.println(day);

    }
}

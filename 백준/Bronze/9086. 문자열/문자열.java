import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = scanner.nextLine();
        }

        for (int i = 0; i < num; i++) {
            System.out.print(str[i].substring(0, 1));
            System.out.print(str[i].substring(str[i].length()-1, str[i].length()));
            System.out.println();
        }

    }
}

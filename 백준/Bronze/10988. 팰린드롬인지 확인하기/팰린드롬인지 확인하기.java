import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] ch = str.toCharArray();
        boolean result = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (ch[i] != ch[str.length() - 1 - i]) {
                result = false;
                break;
            }
        }

        if (result == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}

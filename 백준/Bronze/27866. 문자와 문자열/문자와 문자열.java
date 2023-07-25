import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = scanner.nextInt();

        char[] ch = str.toCharArray();
        System.out.println(ch[index-1]);
    }
}

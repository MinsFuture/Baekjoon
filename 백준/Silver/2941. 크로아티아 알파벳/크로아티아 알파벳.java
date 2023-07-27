import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        for (int i = 0; i < croatia.length; i++) {
            if (str.contains(croatia[i])) {
                str = str.replaceAll(croatia[i] ,"!");
            }
        }

        System.out.print(str.length());
    }
}

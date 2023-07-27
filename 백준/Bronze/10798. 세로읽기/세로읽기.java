import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] ary = new char[5][15];
        int max = 0;
        String str = null;

        for (int i = 0; i < 5; i++) {
            str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                ary[i][j] = str.charAt(j);
            }

            if (max < str.length()) {
                max = str.length();
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (ary[j][i] != '\0') {
                    System.out.print(ary[j][i]);
                }
            }
        }
    }
}

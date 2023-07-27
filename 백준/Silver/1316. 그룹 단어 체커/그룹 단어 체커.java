import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index;
        int cnt = n;
        String[] str = new String[n];
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            str[i] = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            boolean[] alphabet = new boolean[26];
            for (int j = 0; j < str[i].length(); j++) {
                index = str[i].charAt(j) - 'a';
                if (alphabet[index] == false) {
                    alphabet[index] = true;
                } else {
                    if (str[i].charAt(j - 1) != str[i].charAt(j)) {
                        cnt--;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
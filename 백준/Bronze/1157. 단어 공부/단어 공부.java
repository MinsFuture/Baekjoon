import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] alphabet = new int[26];
        int index = 0;
        int max = 0; int cnt = 0;

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (65 <= ch[i] && ch[i] <= 90) {
                index = ch[i] - 65;
                alphabet[index]++;
            } else {
                index = ch[i] - 97;
                alphabet[index]++;
            }
        }

        for (int i = 0; i < alphabet.length; i++){
            if (max < alphabet[i]) {
                max = alphabet[i];
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == max) {
                index = i;
                cnt++;
            }
        }

        if (cnt == 1) {
            System.out.println((char)(index + 65));
        } else {
            System.out.println("?");
        }
    }
}

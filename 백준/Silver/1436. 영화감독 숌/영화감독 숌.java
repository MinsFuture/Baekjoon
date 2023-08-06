import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sixNum = 0;
        int cnt = 0;
        int start = 666;
        String str;
        boolean run = true;

        while (run) {
            str = String.valueOf(start++);
            char[] ch = str.toCharArray();

            for (int i = 0; i < ch.length-2; i++) {
                if ((ch[i] == '6' && ch[i+1] == '6') && (ch[i+1] == '6' && ch[i+2] == '6')) {
                    cnt++;
                    break;
                }
            }

            if (n == cnt) {
                run = false;
            }
        }

        System.out.println(--start);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 이동할 채널
        boolean[] button = new boolean[10];
        Arrays.fill(button, true);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            button[sc.nextInt()] = false; // 고장
        }


        int result = Math.abs(N - 100); // 단순히 +, -로 이동

        for (int i = 0; i <= 1000000; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean canMake = true; // 해당 숫자(i)를 만들 수 있어?

            for (int j = 0; j < len; j++) {
                if (!button[str.charAt(j) - '0']) {
                    canMake = false;
                    break;
                }
            }

            if (canMake) {
               int moveToClickButton = len + Math.abs(N - i); // i라는 채널로 가기 + (+ or - 를 누르기)
                result = Math.min(moveToClickButton, result);
            }
        }

        System.out.println(result);
    }
}

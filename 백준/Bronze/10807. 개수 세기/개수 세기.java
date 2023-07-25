import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = 0;

        int[] ary = new int[num];
        for (int i = 0; i < num; i++) {
            ary[i] = scanner.nextInt();
        }
        int check = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            if (ary[i] == check) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}

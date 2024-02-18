import java.util.Scanner;

public class Main {

    public static int n;
    public static int[] ary;
    public static int cnt;
    public static int result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ary = new int[n];

        cnt = 0;
        recur(0);

        System.out.println(cnt);
    }

    public static void recur(int depth) {

        if (depth == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            ary[depth] = i;
            if (possibility(depth)) {
                recur(depth + 1);
            }
        }
    }

    private static boolean possibility(int depth) {

        for (int i = 0; i < depth; i++) {
            if (ary[depth] == ary[i]) {
                return false;
            } else if (Math.abs(i - depth) == Math.abs(ary[i] - ary[depth])) {
                return false;
            }
        }

        return true;
    }


}
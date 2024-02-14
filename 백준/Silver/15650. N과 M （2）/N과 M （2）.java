import java.util.Scanner;

public class Main {

    public static int m;
    public static int n;
    public static int[] ary;
    public static StringBuilder result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        ary = new int[m]; // 0 ~ m-1
        result = new StringBuilder();

        recur(1, 0);
        System.out.print(result);
    }

    public static void recur(int startIndex, int depth) {

        if (depth == m) {
            for (int i : ary) {
                result.append(i).append(' ');
            }
            result.append("\n");
            return;
        }

        for (int i = startIndex; i <= n; i++) {
            ary[depth] = i;

            recur(i + 1, depth + 1);
        }
    }
}


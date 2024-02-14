import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static boolean[] visited;
    public static int[] ary;
    public static StringBuilder result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        visited = new boolean[n+1];
        ary = new int[m];
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

            recur(i, depth+1);
        }

    }
}

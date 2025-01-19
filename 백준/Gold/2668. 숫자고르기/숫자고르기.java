import java.util.*;

public class Main {
    static boolean[] visited;
    static int n;
    static int[] ary;
    static List<Integer> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        visited = new boolean[n+1];
        list = new ArrayList<>();

        ary = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ary[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            visited[i] = true;
            dfs(i, i);
            visited[i] = false;
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void dfs(int start, int target) {
        if (ary[start] == target) {
            list.add(target);
            return;
        }

        if (!visited[ary[start]]) {
            visited[ary[start]] = true;
            dfs(ary[start], target);
            visited[ary[start]] = false;
        }
    }
}


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ary = new int[n];

        for (int i = 0; i < n; i++) {
           list.add(scanner.nextInt());
        }

        list.sort(Comparator.naturalOrder());

        System.out.println(list.get(n-k));
    }
}

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int a = w - x;
        int b = h - y;
        list.add(x); list.add(y); list.add(a); list.add(b);
        list.sort(Comparator.naturalOrder());

        System.out.println(list.get(0));
    }
}

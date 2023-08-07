import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int a;

        for (int i = 0; i < testcase; i++) {
            list.add(scanner.nextInt());
        }

        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < testcase; i++) {
            a = list.get(i);
            System.out.println(a);
        }
    }
}

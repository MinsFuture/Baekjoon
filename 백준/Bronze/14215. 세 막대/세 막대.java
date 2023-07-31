import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        list.sort(Comparator.naturalOrder());
        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);
        if (c < a + b) {
            System.out.println(a + b + c);
        } else {
            System.out.println(2 * (a + b) - 1);
        }
    }
}

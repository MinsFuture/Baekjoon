import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list_x = new ArrayList<>();
        List<Integer> list_y = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            list_x.add(scanner.nextInt());
            list_y.add(scanner.nextInt());
        }

        list_x.sort(Comparator.naturalOrder());
        list_y.sort(Comparator.naturalOrder());

        int min_x = list_x.get(0);
        int max_x = list_x.get(num-1);
        int min_y = list_y.get(0);
        int max_y = list_y.get(num-1);

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}

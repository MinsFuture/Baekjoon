import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list_x = new ArrayList<>();
        List<Integer> list_y = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            list_x.add(scanner.nextInt());
            list_y.add(scanner.nextInt());
        }
        list_x.sort(Comparator.naturalOrder());
        list_y.sort(Comparator.naturalOrder());
        if (list_x.get(0).equals(list_x.get(1))) {
            System.out.print(list_x.get(2));
        } else {
            System.out.print(list_x.get(0));
        }

        System.out.print(" ");
        if (list_y.get(0).equals(list_y.get(1))) {
            System.out.print(list_y.get(2));
        } else {
            System.out.print(list_y.get(0));
        }
    }

}


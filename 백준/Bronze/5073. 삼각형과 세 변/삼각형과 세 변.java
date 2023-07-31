import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            for (int i = 0; i < 3; i++) {
                list.add(scanner.nextInt());
            }
            list.sort(Comparator.naturalOrder());
            int a = list.get(0);
            int b = list.get(1);
            int c = list.get(2);

            if (a == 0 && b == 0 && c == 0) {
                run = false;
                break;
            }

            if (c >= a + b) {
                System.out.println("Invalid");
            } else {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a != b && b != c && a != c) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("Isosceles");
                }
            }

            list.clear();
        }
    }
}


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int ave = 0;

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
            ave += list.get(i);
        }

        list.sort(Comparator.naturalOrder());
        
        System.out.println(ave/5); // 평균값
        System.out.println(list.get(2)); // 중앙값
    }
}

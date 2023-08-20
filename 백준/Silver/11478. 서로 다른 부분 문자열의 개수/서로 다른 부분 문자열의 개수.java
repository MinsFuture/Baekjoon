import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();

        int[] num = new int[str.length() + 1];
        int cases = 0;

        for (int i = 1; i <= str.length(); i++) {
            num[i] = i; // num[1] = 1, num[2] = 2;
            cases += num[i];
        }

        int start, diff;
        int index = 0;
        String[] strAry = new String[cases];

        // (1 1) (2 2) (3 3) (4 4) (5 5) // (1 2) (2 3) (3 4) (4 5) // (1 3) (2 4) (3 5)...
        for (int i = 1; i <= str.length(); i++) {
            start = 0;
            diff = str.length() - num[str.length() + 1 - i];
            for (int j = i; j <= str.length(); j++) {
                strAry[index++] = str.substring(start, start + diff + 1);
                start++;
            }
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cases; i++) {
            if (!map.containsKey(strAry[i])) {
                map.put(strAry[i], i);
            }
        }

        System.out.print(map.size());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        List<Integer> listsToInt = new ArrayList<>();
        List<Character> listsToChar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str,"-+", true);

        while (st.hasMoreTokens()) {
            String name = st.nextToken();

            if (name.equals("-") || name.equals("+")) {
                char ch = name.charAt(0);
                listsToChar.add(ch);
            } else {
                int temp = Integer.parseInt(name);
                listsToInt.add(temp);
            }
        }

        for (int i = 0; i < listsToChar.size() - 1; i++) {
            if (listsToChar.get(i) == '-'){
                listsToChar.set(i+1, '-');
            }
        }

        int sum = listsToInt.get(0);
        for (int i = 0; i < listsToChar.size(); i++) {
                if (listsToChar.get(i) == '-') {
                    sum -= listsToInt.get(i + 1);
                } else {
                    sum += listsToInt.get(i + 1);
                }
        }

        System.out.print(sum);
    }

}

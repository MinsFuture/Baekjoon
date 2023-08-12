import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] ary = new String[n];
        for (int i = 0; i < n; i++) {
            ary[i] = scanner.nextLine();
        }

        Arrays.sort(ary, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        for (int i = 0; i < n; i++) {
            if (!list.contains(ary[i])) {
                list.add(ary[i]);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }

    }
}

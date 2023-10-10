import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();

        System.out.println(solve(S, T));
    }

    static int solve(String str1, String str2) {
        count++;
        if (str1.length() == str2.length()) {
            if (str1.equals(str2)) {
                return 1;
            } else {
                return 0;
            }
        }

        int ans = 0;
        if (str2.charAt(0) == 'B') {
            StringBuilder temp = new StringBuilder(str2.substring(1));
            temp.reverse();
            ans += solve(str1, temp.toString());
        }
        
        if (str2.charAt(str2.length() - 1) == 'A') {
            ans += solve(str1, str2.substring(0, str2.length() - 1));
        }

        return ans > 0 ? 1 : 0;
    }
}

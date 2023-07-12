import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        int strLength = str.length();

        if ((1 <= strLength && strLength <= 10) && (1 <= n && n <= 5)) {
            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
        }
    }
}
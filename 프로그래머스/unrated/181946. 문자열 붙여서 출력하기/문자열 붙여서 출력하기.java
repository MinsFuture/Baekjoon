import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int aLength = a.length();
        int bLength = b.length();
        if ((1 <= aLength && aLength <= 10) && (1 <= bLength && bLength <= 10)) {
            System.out.print(a + b);
        }
    }
}
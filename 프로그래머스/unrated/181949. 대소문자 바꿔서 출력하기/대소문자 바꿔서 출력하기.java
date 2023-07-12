import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aLength = a.length();
        int c;

        if (1 <= aLength && aLength <= 20) {
            for (int i = 0; i < aLength; i++) {
                c = (int) a.charAt(i);
                if (65 <= c && c <= 90) {
                    c = c + 32;
                    System.out.print((char) c);
                } else if (97 <= c && c <= 122) {
                    c = c - 32;
                    System.out.print((char) c);
                } else {
                }
            }
        }
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int aLength = a.length();

        if (1 <= aLength && aLength <= 10) {
            for (int i = 0; i < aLength; i++) {
                System.out.println(a.charAt(i));
            }
        }
    }
}
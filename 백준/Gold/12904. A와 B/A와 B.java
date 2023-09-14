import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String str = sc.nextLine();

        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = str.length() - 1; i >= target.length(); i--) {
            if (stringBuffer.charAt(i) == 'A') {
                stringBuffer.deleteCharAt(i);
            } else {
                stringBuffer.deleteCharAt(i);
                stringBuffer.reverse();
            }
        }

        if (stringBuffer.toString().equals(target)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        BigInteger num = new BigInteger(str);
        System.out.print(num.sqrt());
    }
}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String number = sc.nextLine();
        int sum = 0;

        for(int i = 0; i<N; i++){
            sum += Integer.parseInt(number.substring(i, i+1));
        }

        System.out.println(sum);
    }
}
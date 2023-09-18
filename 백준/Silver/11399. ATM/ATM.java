import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] timeAry = new int[n];
        for (int i = 0; i < n; i++) {
            timeAry[i] = sc.nextInt();
        }
        Arrays.sort(timeAry);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for(int j = i; j<n; j++)
                sum += timeAry[i];
        }

        System.out.print(sum);
    }
}

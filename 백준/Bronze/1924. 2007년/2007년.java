import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        int[] month_ary = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day_ary = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int daySum = day - 1;

        for (int i = 1; i < month; i++) {
            daySum += month_ary[i];
        }

        System.out.print(day_ary[daySum % 7]);
    }
}

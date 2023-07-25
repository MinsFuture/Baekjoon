import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double max = 0;
        double sum = 0;
        double ave = 0;
        double[] ary = new double[num];
        for (int i = 0; i < num; i++) {
            ary[i] = scanner.nextDouble();
            sum += ary[i];
            if (max < ary[i]) {
                max = ary[i];
            }
        }

        for (int i = 0; i < num; i++) {
            ary[i] = (ary[i]/max)*100;
            ave += ary[i];
        }
        System.out.println(ave/num);
    }
}

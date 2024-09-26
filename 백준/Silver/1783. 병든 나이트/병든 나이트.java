import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); // x

        int answer = 1;
        boolean flag = true;

        // n = 높이

        if(n == 1) {
            answer = 1;
        }else if(n == 2){
            answer = (m + 1) / 2;
            if(answer > 4){
                answer = 4;
            }
        }else{
            if (m <= 3) {
                answer = m;
            } else if (4 <= m && m <= 6) {
                answer = 4;
            } else {
                answer = m - 2;
            }
        }

        System.out.println(answer);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        // b의 끝 자리가 1이면 1을 빼주고, 아니면 2를 나눈다.
        while(a != b){
            String str = Integer.toString(b);
            if(str.charAt(str.length() -1) == '1'){
                b = Integer.parseInt(str.substring(0, str.length() -1));
            } else if (b % 2 == 0){
                b = b/2;
            } else{
                System.out.print(-1);
                return;
            }

            cnt++;

            if(a > b){
                System.out.print(-1);
                return;
            }
        }

        System.out.print(cnt + 1);
    }
}
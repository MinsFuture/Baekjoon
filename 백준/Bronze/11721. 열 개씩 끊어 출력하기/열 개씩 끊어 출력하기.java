import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();

        for(int i = 0; i<length; i += 10){
            if(i+10 > length){
                System.out.println(str.substring(i, length));
                continue;
            }
            System.out.println(str.substring(i, i+10));
        }
    }
}
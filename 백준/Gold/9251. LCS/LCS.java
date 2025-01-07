import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int [][]dp = new int[str1.length()][str2.length()];

        for(int i = 0; i<str1.length(); i++){
            if(str2.charAt(0) != str1.charAt(i)){
                dp[i][0] = 0;
            } else{
                for(int j = i; j<str1.length(); j++){
                    dp[j][0] = 1;
                }
                break;
            }
        }

        for(int i = 0; i<str2.length(); i++){
            if(str1.charAt(0) != str2.charAt(i)){
                dp[0][i] = 0;
            } else{
                for(int j = i; j<str2.length(); j++){
                    dp[0][j] = 1;
                }
                break;
            }
        }


        for(int i = 1; i<str1.length(); i++){
            for(int j = 1; j<str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[str1.length()-1][str2.length()-1]);
    }
}
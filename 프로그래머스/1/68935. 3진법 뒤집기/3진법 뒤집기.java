import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        int num = n;
        while(num >= 1){
            sb.append(num % 3);
            num /= 3;
        }
        
        String str = sb.toString();
        int degree = 1;
        
        for(int i = 0; i<str.length(); i++){
            answer += (str.charAt(str.length() - i - 1) - '0') * degree;
            degree *= 3;
        }
    
        
        return answer;
    }
}
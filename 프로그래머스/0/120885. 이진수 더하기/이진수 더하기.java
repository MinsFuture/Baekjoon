import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        
        if((bin1.charAt(0) == '0') && (bin2.charAt(0) == '0')){
            return "0";
        }
        
        int result = 0; 
        for(int i = 0; i<bin1.length(); i++){
            int digit = bin1.charAt(bin1.length() - i - 1) - '0';
            result += digit * Math.pow(2, i);
        }
        
        for(int i = 0; i<bin2.length(); i++){
            int digit = bin2.charAt(bin2.length() - i - 1) - '0';
            result += digit * Math.pow(2, i);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(result > 0){
            sb.append(result % 2);    
            result /= 2;
        }
        
        
        return sb.reverse().toString();
    }
}
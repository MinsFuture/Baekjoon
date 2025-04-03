import java.util.*;

class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(age);
        
        for(int i = 0; i<str.length(); i++){
            int a = str.charAt(i) - '0';
            sb.append((char)(97 + a));
        }
        
        return sb.toString();
    }
}
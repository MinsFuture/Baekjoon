import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] charAry = my_string.toCharArray();
        Arrays.sort(charAry);
        
        answer = new String(charAry);
        
        return answer;
    }
}
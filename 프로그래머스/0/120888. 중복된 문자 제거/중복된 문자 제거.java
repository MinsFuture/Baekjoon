import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<my_string.length(); i++){
            if(set.contains(my_string.charAt(i))){
                continue;
            }
            set.add(my_string.charAt(i));
            sb.append(my_string.charAt(i));   
        }
        
        return sb.toString();
    }
}
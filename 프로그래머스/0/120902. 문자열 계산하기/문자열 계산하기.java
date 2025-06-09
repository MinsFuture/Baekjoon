import java.util.*;

class Solution {
    public int solution(String my_string) {
        String[] list = my_string.split(" ");
        int result = 0;
        
        result += Integer.parseInt(list[0]);
        
        for(int i = 1; i<list.length - 1; i++){
            if(list[i].equals("+")){
                result += Integer.parseInt(list[i+1]);                
            }
            
            if(list[i].equals("-")){
                result -= Integer.parseInt(list[i+1]);                
            }
        }
        
        return result;
    }
}
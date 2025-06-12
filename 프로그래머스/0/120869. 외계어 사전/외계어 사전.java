import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i<dic.length; i++){
            boolean[] bools = new boolean[spell.length];
            for(int j = 0; j<dic[i].length(); j++){
                String str = String.valueOf(dic[i].charAt(j));
                for(int k = 0; k<spell.length; k++){
                    if(spell[k].equals(str)){
                        bools[k] = true;
                    }
                }
            }
            
            boolean flag = true;
            
            for(int j = 0; j<spell.length; j++){
                if(bools[j] == false){
                    flag = false;
                }
            }
            
            if(flag){
                return 1;
            }
        }
       
        
        return 2;
    }
}
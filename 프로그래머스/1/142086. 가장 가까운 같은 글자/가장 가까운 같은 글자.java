import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(map.containsKey(a)){
                int index = map.get(a);
                answer[i] = i - index;
                map.put(a, i);
            } else{
                answer[i] = -1;
                map.put(a, i);
            }
        }
        
        
        return answer;
    }
}
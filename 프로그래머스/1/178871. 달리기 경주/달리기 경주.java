import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        Map<String, Integer> map = new HashMap<>();
      
        for(int i = 0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0; i<callings.length; i++){
            int index = map.get(callings[i]);
            map.put(callings[i], index -1);
            map.put(players[index - 1], index);
            
            String temp = players[index-1];
            players[index-1] = players[index];
            players[index] = temp;
        }
        
        for(String key : map.keySet()){
            answer[map.get(key)] = key;
        }
        
        return answer;
    }
}
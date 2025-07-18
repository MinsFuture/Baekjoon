import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i<names.length; i++){
            if(i * 5 < names.length){
                list.add(names[i * 5]);        
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
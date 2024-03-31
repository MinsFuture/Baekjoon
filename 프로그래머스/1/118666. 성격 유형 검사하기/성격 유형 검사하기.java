import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int n = survey.length;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            
            int score = Math.abs(choices[i] - 4);
        
            if(choices[i] < 4){
                map.put(c1, map.getOrDefault(c1, 0) + score);
            } else{
                map.put(c2, map.getOrDefault(c2, 0) + score);
            }
        }
        
        sb.append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T');
        sb.append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F');
        sb.append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M');
        sb.append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N');
        answer = sb.toString();
        
        return answer;
    }
}
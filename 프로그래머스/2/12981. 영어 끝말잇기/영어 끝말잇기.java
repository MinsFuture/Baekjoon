import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String beforeStr = null;
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<words.length; i++){
            
            if(map.containsKey(words[i]) 
               || (i > 0 && beforeStr.charAt(beforeStr.length()-1) != words[i].charAt(0))){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            // 번호 : i = 0은 1번, i = 1은 2번, i = 2는 3번, i = 3은 1번
            // 차례 : i = 0, 1, 2는 1 / i = 3, 4, 5는 2
            
         
            map.put(words[i], 0);
            beforeStr = words[i];
        }

        return answer;
    }
}
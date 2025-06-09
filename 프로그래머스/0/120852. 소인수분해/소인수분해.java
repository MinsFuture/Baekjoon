import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        Set<Integer> set = new HashSet<>();
        int num = n;
        
        for(int i = 2; i<= n;){
            if(num == 1){
                break;
            }
            
            if(num % i == 0){
                set.add(i);
                num /= i;
                continue;
            }
            
            i++;
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
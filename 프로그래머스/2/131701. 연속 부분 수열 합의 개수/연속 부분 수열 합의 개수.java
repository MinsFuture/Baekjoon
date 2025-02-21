import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<elements.length; i++){
            for(int j = 0; j<elements.length; j++){
                int sum = 0;
                for(int k = 0; k<=i; k++){
                    sum += elements[(j + k) % elements.length];
                }
                set.add(sum);
            }
        }
        
        // 0, 1, 2, 3, 4 
        // (0, 1) (1, 2) (2, 3) (3, 4) (4, 5)
        // (0, 1, 2) (1, 2, 3) (2, 3, 4) ...
        answer = set.size();
        
        
        return answer;
    }
}
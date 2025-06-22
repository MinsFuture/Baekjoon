import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max = 0;
        int min = 0;
        
        for(int i = 0; i<sizes.length; i++){
            int u = Math.max(sizes[i][0], sizes[i][1]);
            int v = Math.min(sizes[i][0], sizes[i][1]);
            
            max = Math.max(u, max);
            min = Math.max(v, min);
        }
        
        
        return max * min;
    }
}
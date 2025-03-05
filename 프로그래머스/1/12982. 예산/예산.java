import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        int sum = 0;
        while(true){
            if(answer == d.length || sum + d[answer] > budget){
                break;
            }
            sum += d[answer];
            answer++;
        }
        
        return answer;
    }
}
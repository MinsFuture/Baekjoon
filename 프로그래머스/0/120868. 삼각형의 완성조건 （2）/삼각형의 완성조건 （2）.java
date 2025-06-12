import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        // 1. side 중 하나가 가장 긴 변일떄
        for(int i = 1; i<Math.max(sides[0], sides[1]); i++){
            if(i + Math.min(sides[0], sides[1]) > Math.max(sides[0], sides[1])){
                answer++;
            }
        }
        
        // 2. 가장 긴변이 side가 아닐때
        for(int i = Math.max(sides[0], sides[1]); ; i++){
            if(sides[0] + sides[1] > i){
                answer++;
            } else{
                break;
            }
        }
        
        
        return answer;
    }
}
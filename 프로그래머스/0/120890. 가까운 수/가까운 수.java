import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0; // 반환할 arr 값
        int min = Integer.MAX_VALUE; // 현재 가장 작은 차이
        
        for(int i = 0; i<array.length; i++){
            int diff = Math.abs(n - array[i]); // 차이
            if(diff < min){
                answer = array[i];
                min = diff;
            }
            
            if(diff == min){
                if(answer > array[i]){
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}
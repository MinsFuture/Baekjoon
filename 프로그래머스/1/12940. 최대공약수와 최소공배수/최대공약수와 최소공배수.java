import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = Math.min(n, m);
        int b = Math.max(n, m);
        int x = 0;
        int y = 0;
        
        for(int i = 1; i<=b; i++){
            if(n % i == 0 && m % i == 0){
                x = Math.max(x, i);
            }
        }
        
        y = a * b / x;
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
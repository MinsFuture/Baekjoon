import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<ingredient.length; i++){
            int num = ingredient[i];
            list.add(num);
            int n = list.size();
            if(n >= 4){
                if(list.get(n-1) == 1 && list.get(n-2) == 3 &&
                   list.get(n-3) == 2 && list.get(n-4) == 1
                  ){
                   answer++;
                   for(int j = 0; j<4; j++){
                       list.remove(n - j  -1);
                   }
                }
            }
        }
        
        return answer;
    }
}
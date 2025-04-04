import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        List<Integer> list = new ArrayList<>();

        // 0 1 2 -> 2 0 1 , 'right'
        int l = numbers.length;
        
        if(direction.equals("right")){
            for(int i = l - 1; i<2* l - 1; i++){
            list.add(numbers[i % numbers.length]);
            } 
        } else{
            for(int i = 1; i<=l; i++){
                list.add(numbers[i % numbers.length]);
            }
        }
       
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
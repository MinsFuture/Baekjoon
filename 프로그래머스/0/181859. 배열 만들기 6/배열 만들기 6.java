import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                continue;
            }
            
            if(stack.peek() == arr[i]){
                stack.pop();
            } else{
                stack.push(arr[i]);
            }
        }
        
        if(stack.isEmpty()){
            int[] ary = {-1};
            return ary;
        }
        
        int size = stack.size();
        int[] answer = new int[size];
        for(int i = 0; i<size; i++){
            answer[size - i - 1] = stack.pop();
        }
        
        
        return answer;
    }
}
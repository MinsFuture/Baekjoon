import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] ary = s.split(" ");
        int answer = 0;
        
        for(int i = 0; i<ary.length; i++){            
            if(ary[i].equals("Z")){
                stack.pop();
                continue;
            }
            stack.add(Integer.parseInt(ary[i]));
        }
        
        int length = stack.size();
        
        for(int i = 0; i<length; i++){
            answer += stack.pop();
        }
        
        return answer;
    }
}
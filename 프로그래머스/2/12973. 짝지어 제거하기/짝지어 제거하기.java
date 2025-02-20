import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
     
        Stack<Character> stack = new Stack();
        for(int i = 0; i<s.length(); i++){
            if(stack.isEmpty() || stack.peek() != s.charAt(i)){
                stack.add(s.charAt(i));
                continue;
            }
            
            stack.pop();
        }
        
        if(stack.isEmpty()){
            return 1;
        }
        
        return 0;
    }
}
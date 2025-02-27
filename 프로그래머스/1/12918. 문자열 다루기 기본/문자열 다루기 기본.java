class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        
        if(length != 4 && length != 6){
            return false;
        } 
       
            // 48 ~ 57
        for(int i = 0; i<s.length(); i++){
            if(48 > s.charAt(i) || s.charAt(i) > 57){
                return false;
            }
        }
        
        
        return answer;
    }
}
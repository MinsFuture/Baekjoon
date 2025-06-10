class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean flag = true;
        int idx = 0;
        
        while(flag){
            if(n_str.charAt(idx) != '0'){
                flag = false;
                break;
            }
            idx++;
        }
        
        
        answer = n_str.substring(idx, n_str.length());
        
        
        return answer;
    }
}
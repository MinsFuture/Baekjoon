class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i<my_string.length(); i++){
            char a = my_string.charAt(i);
            if(('0' <= a) && (a <= '9')){
                answer += a - '0';
            }
        }
        
        return answer;
    }
}
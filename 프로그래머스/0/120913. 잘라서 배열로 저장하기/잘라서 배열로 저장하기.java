class Solution {
    public String[] solution(String my_str, int n) {
        
        int length = 0;
        if(my_str.length() % n == 0){
            length = my_str.length() / n;
        } else{
            length = my_str.length() / n + 1;
        }
        
        String[] answer = new String[length];
        for(int i = 0; i<length; i++){
            if(i == length - 1){
                String str = my_str.substring(i * n, my_str.length());
                answer[i] = str;
                break;
            }
            
            String str = my_str.substring(i * n, (i+1) * n);
            answer[i] = str;
        }
        
        return answer;
    }
}
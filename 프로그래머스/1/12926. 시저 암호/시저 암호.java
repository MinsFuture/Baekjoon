class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(('A' <= ch) &&(ch <= 'Z')){
                char next = (char)((ch - 'A' + n) % 26 + 'A');
                sb.append(next);
            } else if(('a' <= ch) &&(ch <= 'z')){
                char next = (char)((ch - 'a' + n) % 26 + 'a');
                sb.append(next);
            } else{
                sb.append(ch);
            }    
        }
        
        return sb.toString();
    }
}
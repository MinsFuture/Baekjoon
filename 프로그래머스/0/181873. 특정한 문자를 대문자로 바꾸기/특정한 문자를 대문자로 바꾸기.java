class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        my_string = my_string.replaceAll(alp, alp.toUpperCase());
        
        return my_string;
    }
}
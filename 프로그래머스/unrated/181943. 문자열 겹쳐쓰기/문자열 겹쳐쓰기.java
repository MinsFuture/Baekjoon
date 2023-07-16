class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       String answer = "";
        char[] char_My_string = my_string.toCharArray();
        char[] char_overwrite_string = overwrite_string.toCharArray();

        for (int i = s; i < s + overwrite_string.length(); i++) {
            char_My_string[i] = char_overwrite_string[i - s];
        }
        answer = String.valueOf(char_My_string);
        return answer;
    }
}
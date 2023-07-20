class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int length = my_string.length();

        answer = my_string.substring(length - n, length);

        return answer;
    }
}
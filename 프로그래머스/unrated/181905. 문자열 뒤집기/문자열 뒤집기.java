class Solution {
    public String solution(String my_string, int s, int e) {
        char[] ch = my_string.toCharArray();
        char temp;

        for (int i = s; i <= (s + e) / 2; i++) {
            temp = ch[i];
            ch[i] = ch[s + e - i];
            ch[s + e - i] = temp;
        }

        return String.valueOf(ch);
    }
}
class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] char_my_string = my_string.toCharArray();

        for (int i : index_list) {
            stringBuffer.append(char_my_string[i]);
        }

        return stringBuffer.toString();
    }
}
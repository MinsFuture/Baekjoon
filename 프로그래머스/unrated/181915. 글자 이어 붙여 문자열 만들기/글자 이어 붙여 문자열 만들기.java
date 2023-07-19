class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] char_my_string = my_string.toCharArray();
        
        for (int i = 0; i < index_list.length; i++) {
            stringBuffer.append(char_my_string[index_list[i]]);
        }

        return stringBuffer.toString();
    }
}
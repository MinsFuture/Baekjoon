class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = my_string.length() / m;
        String[] str = new String[length];

        for (int i = 0; i < length; i++) {
            str[i] = my_string.substring(i * m, (i + 1) * m);
        }

        for (String s : str) {
            stringBuffer.append(s.charAt(c - 1));
        }

        return stringBuffer.toString();
    }
}
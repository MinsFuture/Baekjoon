class Solution {
    public String solution(String str1, String str2) {
       String answer = "";
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        char[] str = new char[charStr1.length + charStr2.length];

        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                str[i] = charStr1[i / 2];
            } else {
                str[i] = charStr2[i / 2];
            }
        }

        answer = String.valueOf(str);
        return answer;
    }
}
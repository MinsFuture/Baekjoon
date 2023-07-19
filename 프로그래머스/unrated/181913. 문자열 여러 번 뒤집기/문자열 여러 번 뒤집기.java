class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] ch = my_string.toCharArray();

        for (int[] query : queries) {
            int s = query[0]; int e = query[1];
            char temp;

            for (int i = s; i <= (s + e)/2; i++) {
                temp = ch[i];
                ch[i] = ch[s + e - i];
                ch[s + e - i] = temp;
            }
        }

        answer = String.valueOf(ch);

        return answer;
    }
}
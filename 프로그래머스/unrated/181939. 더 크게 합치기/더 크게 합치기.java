class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_Str = Integer.toString(a);
        String b_Str = Integer.toString(b);

        String ab = a_Str + b_Str;
        String ba = b_Str + a_Str;

        if (Integer.parseInt(ab) < Integer.parseInt(ba)) {
            answer = Integer.parseInt(ba);
        } else {
            answer = Integer.parseInt(ab);
        }

        return answer;
    }
}
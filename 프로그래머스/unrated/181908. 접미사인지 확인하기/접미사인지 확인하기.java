class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        int length = my_string.length();
        String[] ary = new String[length];

        for (int i = 0; i < length; i++) {
            ary[i] = my_string.substring(i);
            if (ary[i].equals(is_suffix)) {
                return 1;
            }
        }
        return 0;
    }
}
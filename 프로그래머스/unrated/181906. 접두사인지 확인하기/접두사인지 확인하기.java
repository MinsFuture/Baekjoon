class Solution {
    public int solution(String my_string, String is_prefix) {
        String[] str = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            str[i] = my_string.substring(0, i+1);
            if (str[i].equals(is_prefix)) {
                return 1;
            }
        }
        return 0;
    }
}
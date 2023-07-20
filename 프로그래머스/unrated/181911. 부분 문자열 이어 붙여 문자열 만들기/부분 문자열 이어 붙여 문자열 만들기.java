class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;

        for (int[] arr : parts) {
            int s = arr[0]; int e = arr[1];
            stringBuffer.append(my_strings[i++].substring(s, e+1));
        }

        return stringBuffer.toString();
    }
}
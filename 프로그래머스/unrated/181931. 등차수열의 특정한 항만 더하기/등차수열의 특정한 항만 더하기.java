class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int term = a;
        for (int i = 0; i < included.length; i++){
            if (included[i] == true) {
                sum += term;
            }
            term += d;
        }

        return sum;
    }
}
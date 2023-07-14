class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ab_2 = 2 * a * b;

        return ab >= ab_2 ? ab : ab_2;
    }
}
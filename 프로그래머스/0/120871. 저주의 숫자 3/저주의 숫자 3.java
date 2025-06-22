class Solution {
    public int solution(int n) {
        int count = 0;
        int current = 0;

        while (count < n) {
            current++;
            if (isValid(current)) {
                count++;
            }
        }

        return current;
    }

    // 3x 마을에서 유효한 숫자인지 판단
    private boolean isValid(int num) {
        return num % 3 != 0 && !String.valueOf(num).contains("3");
    }
}
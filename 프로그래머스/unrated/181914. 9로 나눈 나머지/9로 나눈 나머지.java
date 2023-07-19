class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;

        int[] arr = new int[number.length()];
        char[] ch = number.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ch[i] - 48;
            sum += arr[i];
        }

        return sum % 9;
    }
}
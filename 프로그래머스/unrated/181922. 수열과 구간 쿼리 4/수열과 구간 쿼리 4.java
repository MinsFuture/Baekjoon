class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] arrTemp : queries) {
            int min = Integer.MAX_VALUE;
            int s = arrTemp[0];
            int e = arrTemp[1];
            int k = arrTemp[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}
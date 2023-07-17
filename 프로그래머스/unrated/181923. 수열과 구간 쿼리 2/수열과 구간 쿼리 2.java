class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;

        for (int[] arrTemp : queries) {
            int min = Integer.MAX_VALUE;
            int s = arrTemp[0];
            int e = arrTemp[1];
            int k = arrTemp[2];

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                   min = Math.min(arr[i], min);
                }
            }
            answer[index++] = (min == Integer.MAX_VALUE ? -1 : min);
        }

        return answer;
    }
}
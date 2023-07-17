class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int index = 0;

        for (int[] arrTemp : queries) {
            boolean run = true;
            int min = -1;
            int s = arrTemp[0];
            int e = arrTemp[1];
            int k = arrTemp[2];

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    if(run) {
                        min = arr[i];
                        run = false;
                    }
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                }
            }
            answer[index++] = min;
        }

        return answer;
    }
}
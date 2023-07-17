class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int lastIndex = num_list.length -1;
        int i = 0;

        for (i = 0; i <= lastIndex; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[lastIndex] > num_list[lastIndex - 1]) {
            answer[i] = num_list[lastIndex] - num_list[lastIndex - 1];
        } else {
            answer[i] = 2 * num_list[lastIndex];
        }
        
        return answer;
    }
}
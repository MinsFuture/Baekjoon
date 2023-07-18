import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int start, int end) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
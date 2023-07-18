import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int[] empty = {-1};
        int index = 0;

        for (int i = l; i <= r; i++) {
            String str = i +"";
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0' || str.charAt(j) == '5') {
                    count++;
                }
            }
            if (count == str.length()) {
                list.add(i);
            }
        }

        int[] answer =new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        if (list.size() == 0) {
            return empty;
        }

        return answer;
    }
}

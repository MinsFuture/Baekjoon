import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int lastIndex = 0;
        int i = 0;
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i]);
                lastIndex = 0;
                i++;
            } else {
                if (list.get(lastIndex) < arr[i]) {
                    list.add(arr[i]);
                    lastIndex++;
                    i++;
                } else {
                    list.remove(lastIndex);
                    lastIndex--;
                }
            }
        }

        int[] stk = new int[list.size()];

        for (i = 0; i < list.size(); i++) {
            stk[i] = list.get(i);
        }

        return stk;
    }
}
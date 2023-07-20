import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(my_string.substring(i));
        }

        Collections.sort(list);
        String[] answer = new String[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = list.get(i);    
        }
        
        return answer;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] answer = new String[length];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
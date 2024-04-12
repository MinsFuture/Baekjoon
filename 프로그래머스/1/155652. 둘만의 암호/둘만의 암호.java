import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
    
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<26; i++){
            list.add(i);
        }
        
        for(int i = 0; i<s.length(); i++){
            int s_num = s.charAt(i) - 97;
            int cnt = 0;
            for(int j = 1; j<=index + cnt; j++){
                for(int k = 0; k<skip.length(); k++){
                    int skip_num = skip.charAt(k) - 97;
                    if((s_num + j) % list.size() == skip_num){
                        cnt++;
                    }
                }
            }
            
            int result = list.get((s_num + index + cnt) % list.size());
            sb.append((char)('a' + result));
        }
        
        
        
        return sb.toString();
    }
}
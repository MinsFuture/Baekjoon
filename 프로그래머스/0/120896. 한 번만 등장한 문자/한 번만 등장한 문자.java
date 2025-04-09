import java.util.*;

class Solution {
    public String solution(String s) {
        PriorityQueue<Character> pq = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        int[] ary = new int[26];
        int max = 0;
        
        for(int i = 0; i<s.length(); i++){
            ary[s.charAt(i) - 'a']++;
        }
        
        
        for(int i = 0; i<ary.length; i++){
            if(ary[i] == 1){
                pq.add((char)(i + 'a'));
            }
        }
        
        while(!pq.isEmpty()){
            sb.append(pq.poll());
        }
        
        return sb.toString();
    }
}
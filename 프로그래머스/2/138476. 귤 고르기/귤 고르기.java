import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        for(int a : map.keySet()){
            list.add(map.get(a));
        }
        
        Collections.sort(list, Comparator.reverseOrder());
        // 4 3 1 , 2 2 2 1 1 
        
        int index = 0;
        
        while(k > 0){
            k -= list.get(index++);
            answer++;
        }
        
        return answer;
    }
}
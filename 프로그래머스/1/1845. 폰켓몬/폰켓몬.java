import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], nums[i]);
            }
        }
        
        if(map.size() >= nums.length/2){
              answer = nums.length/2;
        } else{
             answer = map.size();
        }

        
        return answer;
    }
}
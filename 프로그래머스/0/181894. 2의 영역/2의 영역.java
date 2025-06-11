class Solution {
    public int[] solution(int[] arr) {        
        int startIdx = 0;
        int endIdx = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                startIdx = i;
                break;
            }
        }
        
        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] == 2){
                endIdx = i;
                break;
            }
        }
        
        if((startIdx == 0) && (endIdx == 0)){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[endIdx - startIdx + 1];
        int idx = 0;
        for(int i = startIdx; i<=endIdx; i++){
            answer[idx++] = arr[i];
        }
        
        
        return answer;
    }
}
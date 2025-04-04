class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] ary = new int[11];
        ary[1] = 1;
        
        for(int i = 2; i<=10; i++){
            ary[i] = ary[i-1] * i;
        }
        
        for(int i = 1; i<=10; i++){
            if(ary[i] ==  n){
                return i;
            }
            
            if(ary[i] > n){
                return i-1;
            }
        }
        
        return answer;
    }
}
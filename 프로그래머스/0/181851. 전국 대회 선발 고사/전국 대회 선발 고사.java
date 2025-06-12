class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int num = 10000;
        
        for(int i = 1; i<=rank.length; i++){
            for(int j = 0; j<rank.length; j++){
                if(i == rank[j] && attendance[j] == true){
                    answer += num * j;
                    num /= 100;
                }
            }
        }
    
        return answer;
    }
}
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i = 0; i<order.length; i++){
            String str = order[i];
            if(str.contains("americano")){
                answer += 4500;
            } else if(str.contains("cafelatte")){
                answer += 5000;
            } else{
                answer += 4500;
            }
        }
        
        return answer;
    }
}
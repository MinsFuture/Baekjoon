class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int a = i; a<=j; a++){
            String str = String.valueOf(a);
            for(int b = 0; b<str.length(); b++){
                if(str.charAt(b) == (char)(k + '0')){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
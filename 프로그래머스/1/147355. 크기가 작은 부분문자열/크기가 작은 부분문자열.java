class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int n = p.length();
        Long pNum = Long.parseLong(p);
        int iterNum = t.length() - n + 1;
    
        String[] ary = new String[iterNum];
        
        for(int i = 0; i<iterNum; i++){
            ary[i] = t.substring(i, n+i);
            if(Long.parseLong(ary[i]) <= pNum){
                answer++;
            }
        }
       
        return answer;
    }
}
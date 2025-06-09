class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] sa = binomial.split(" ");
        
        answer = Integer.parseInt(sa[0]);
        if(sa[1].equals("+")){
            answer += Integer.parseInt(sa[2]);
        } else if(sa[1].equals("-")){
            answer -= Integer.parseInt(sa[2]);
        } else{
            answer *= Integer.parseInt(sa[2]);
        }
        
        
        return answer;
    }
}
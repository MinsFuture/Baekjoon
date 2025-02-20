class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 1; i<=yellow; i++){
            int row = 0;
            int col = 0;
            if(yellow % i == 0){
                row = i;
                col = yellow / i;
            }
            
            int num = (row+col) * 2 + 4;
            if(num == brown){
                answer[0] = col + 2;
                answer[1] = row + 2;
                break;
            }
        }
        
        return answer;
    }
}


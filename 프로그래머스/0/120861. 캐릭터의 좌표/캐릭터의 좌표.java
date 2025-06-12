class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i<keyinput.length; i++){
            String str = keyinput[i];
            if(str.equals("left")){
                if(x > (board[0] / 2) * -1){
                    x--;
                }
            } else if(str.equals("right")){
                if(x < board[0] / 2){
                    x++;
                }
            } else if(str.equals("down")){
                if(y > (board[1] / 2) * -1){
                    y--;
                }
            } else{
                if(y < board[1] / 2) {
                    y++;
                }
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
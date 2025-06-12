class Solution {
    public int[][] solution(int[][] arr) {        
        int row = arr.length;
        int col = arr[0].length;
        
        int[][] answer = new int[Math.max(row, col)][Math.max(row, col)];

        for(int i = 0; i<Math.max(row, col); i++){
            for(int j = 0; j <Math.max(row, col); j++){
                if(i < row && j < col){
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for(int i = 0; i<dots.length; i++){
            for(int j = 0; j<dots[i].length; j++){
                if(j == 0){
                   minX = Math.min(minX, dots[i][j]);
                   maxX = Math.max(maxX, dots[i][j]);
                }
                
                if(j == 1){
                   minY = Math.min(minY, dots[i][j]);
                   maxY = Math.max(maxY, dots[i][j]);
                }
            }
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}
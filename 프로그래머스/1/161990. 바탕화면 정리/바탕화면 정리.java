class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        int[][] ary = new int[n][m];
        
        int min_n = n;
        int max_n = 0;
        int min_m = m;
        int max_m = 0;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(wallpaper[i].charAt(j) == '#'){
                    ary[i][j] = 1;                
                    
                    if(min_n > i){
                       min_n = i;
                   }
                   
                   if(max_n < i){
                       max_n = i;
                   }
                   
                   if(min_m > j){
                       min_m = j;
                   }
                   
                   if(max_m < j){
                       max_m = j;
                   }
                } else{
                    ary[i][j] = 0;   
                }
            }
        }
        
        answer[0] = min_n; answer[1] = min_m;
        answer[2] = max_n+1; answer[3] = max_m+1;
        
        return answer;
    }
}
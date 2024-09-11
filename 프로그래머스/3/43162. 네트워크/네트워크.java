import java.util.*;

class Solution {
    
    static boolean[] visited = new boolean[200];
    static int answer;
    
    public int solution(int n, int[][] computers) {
        answer = 0;
    
        for(int node = 0; node<n; node++){
            if(!visited[node]){
                answer++;
                dfs(node, n, computers);
            }
        }
        
        return answer;
    }
    
    public void dfs(int node, int n, int[][] computers){
        
        visited[node] = true;
        
        for(int i = 0; i<n; i++){
            if(!visited[i] && computers[node][i] == 1){
                dfs(i, n, computers);
            }
        }
        
    }
}
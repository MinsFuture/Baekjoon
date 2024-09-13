import java.util.*;

class Solution {
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] maps) { 
        
        // 3 X 4 이면 n = 3, m =4 이고
        // maps.length = 3, maps[0].length = 4;
        
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int answer = bfs(0, 0, maps, visited);
       
        return answer;
    }
    
    public int bfs(int n, int m, int[][] maps, boolean[][] visited){
        Point init = new Point(n, m, 1);
        Queue<Point> q = new LinkedList<>();
         
        visited[n][m] = true;
        q.offer(init);
            
        while(!q.isEmpty()){
            Point point = q.poll();
            int x = point.getX();
            int y = point.getY(); 
            int count = point.getCount();
            
            if (x == maps.length - 1 && y == maps[0].length - 1) {
                return count;
            }
            
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(0 > nx || nx >= maps.length || 0 > ny || ny >= maps[0].length){
                    continue;
                }
                
                if(!visited[nx][ny] && maps[nx][ny] == 1){
                    visited[nx][ny] = true;
                    Point npoint = new Point(nx, ny, count+1);
                    q.offer(npoint);
                }
            }
        }
        return -1;
    }
    
    class Point{
        private int x;
        private int y;
        private int count;
        
        public int getX(){
            return x;
        }
        
        public int getY(){
            return y;
        }
        
         public int getCount(){
            return count;
        }
        
        public Point(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
    }
    }
}
import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> list = new ArrayList<>();
        list.add(k);
        
        while(k > 1){
            if(k % 2 == 0){
                k /= 2;
            } else{
                k = k * 3 + 1;
            }
            list.add(k);
        }
        
        int n = list.size();
        double sum = 0;
        
        for(int i = 0; i< ranges.length; i++){
            int x1 = ranges[i][0];
            int x2 = n + ranges[i][1] - 1;
            
            if(x1 > x2){
                answer[i] = -1;
                continue;
            }
            for(int x = x1; x< x2; x++){
                double y1 = list.get(x);
                double y2 = list.get(x + 1);
                
                sum += (y2+y1)/2;
            }
            answer[i] = sum;
            sum = 0;
        }
        
        return answer;
    }
}
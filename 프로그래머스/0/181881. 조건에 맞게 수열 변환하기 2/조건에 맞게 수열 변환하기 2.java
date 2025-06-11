import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] newArr = Arrays.copyOf(arr, arr.length);
        
        int x = 0;
        
        while(true){
            x++;
            int[] temp = Arrays.copyOf(newArr, newArr.length);
            
            for(int i = 0; i<arr.length; i++){
                int num = temp[i];
                if(num >= 50 && num % 2 == 0){
                    temp[i] /= 2;
                } else if(num < 50 && num % 2 != 0){
                    temp[i] *= 2;
                    temp[i] += 1;
                }
            }
            
            boolean flag = true;
            
            for(int i = 0; i<arr.length; i++){
                if(newArr[i] != temp[i]){
                    flag = false;
                    break;
                }
            }
            
            newArr = temp;
            
            if(flag){
                return x - 1;
            }
        }
    }
}
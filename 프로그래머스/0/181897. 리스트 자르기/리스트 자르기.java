import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        switch(n){
            case 1:
                answer = getAry(num_list, 0, slicer[1], 1);
                break;
            case 2:
                answer = getAry(num_list, slicer[0], num_list.length - 1, 1);
                break;
            case 3:
                answer = getAry(num_list, slicer[0], slicer[1], 1);
                break;
            case 4:
                answer = getAry(num_list, slicer[0], slicer[1], slicer[2]);
            default:
        }
        
        return answer;
    }
    
    public static int[] getAry(int[] ary, int start, int end, int interval){
    List<Integer> list = new ArrayList<>();
    
    for(int i = start; i<=end; i+= interval){
        list.add(ary[i]);
    }
    
    int[] result = new int[list.size()];
    
    for(int i = 0; i<list.size(); i++){
        result[i] = list.get(i);
    }
    
    return result;
}
}


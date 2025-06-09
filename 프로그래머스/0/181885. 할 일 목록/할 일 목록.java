class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int len = 0;
        for(int i = 0; i<finished.length; i++){
            if(!finished[i]){
                len++;
            }
        }
        
        System.out.println(len);
        
        String[] result = new String[len];
        
        int index = 0;
        for(int i = 0; i<todo_list.length; i++){
            if(!finished[i]){
                result[index++] = todo_list[i];
            }
        }
        
        return result;
    }
}
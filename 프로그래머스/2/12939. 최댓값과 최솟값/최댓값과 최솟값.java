class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
     
        String[] ary = s.split(" ");
        int[] num = new int[ary.length];
        
        for(int i = 0; i<num.length; i++){
            num[i] = Integer.parseInt(ary[i]);
            System.out.println(num[i]);
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<num.length; i++){
            if(min > num[i]){
                min = num[i];
            }
            if(max < num[i]){
                max = num[i]; 
            }
        }
        
        return sb.append(min).append(" ").append(max).toString();
    }
}
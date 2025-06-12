class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        for(int i = 0; i<picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<picture[i].length(); j++){
                for(int a = 0; a<k; a++){
                sb.append(picture[i].charAt(j));
                }
            }
            
            for(int a = 0; a<k; a++){
                answer[idx++] = sb.toString();
            }
        }
        
        return answer;
    }
}
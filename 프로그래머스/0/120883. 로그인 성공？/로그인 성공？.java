class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        for(int i = 0; i<db.length; i++){
            for(int j = 0; j<2; j++){
                if(db[i][0].equals(id_pw[0])){
                    if(db[i][1].equals(id_pw[1])){
                        return "login";
                    } else{
                        answer = "wrong pw";
                    }
                } else{
                    if(!answer.equals("wrong pw")){
                        answer = "fail";    
                    }  
                }
            }
        }
        
        return answer;
    }
}
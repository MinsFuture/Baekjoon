class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int n = survey.length;
        int R = 0, T = 0, C = 0, F = 0, J = 0, M = 0, A = 0, N = 0;
        
        for(int i = 0; i<n; i++){
            char c1 = survey[i].charAt(0);
            char c2 = survey[i].charAt(1);
            
            int score = 0;
            if(choices[i] == 1 || choices[i] == 7){
                score = 3;
            } else if(choices[i] == 2 || choices[i] == 6){
                score = 2;
            } else if(choices[i] == 4){
                score = 0;
            } else{
                score = 1;
            }
        
            if(choices[i] < 4){
               switch(c1){
                        case 'R': R += score;
                       break;
                       case 'T': T += score;
                       break;
                       case 'C': C += score;
                       break;
                       case 'F': F += score;
                       break;
                       case 'J': J += score;
                       break;
                       case 'M': M += score;
                       break;
                       case 'A': A += score;
                       break;
                       case 'N': N += score;
                       break;
                   default:;
               }
            } else{   
                   switch(c2){
                       case 'R': R += score;
                       break;
                       case 'T': T += score;
                       break;
                       case 'C': C += score;
                       break;
                       case 'F': F += score;
                       break;
                       case 'J': J += score;
                       break;
                       case 'M': M += score;
                       break;
                       case 'A': A += score;
                       break;
                       case 'N': N += score;
                       break;
                   default:;
               }
            }
        }
        
        if(R >= T){
            sb.append('R');
        } else{
            sb.append('T');
        }
        
         if(C >= F){
            sb.append('C');
        } else{
            sb.append('F');
        }
        
         if(J >= M){
            sb.append('J');
        } else{
            sb.append('M');
        }
        
         if(A >= N){
            sb.append('A');
        } else{
            sb.append('N');
        }
        
        
        answer = sb.toString();
        
        return answer;
    }
}
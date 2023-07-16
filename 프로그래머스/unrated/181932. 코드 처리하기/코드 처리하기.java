class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = false;

        char[] charCode = code.toCharArray();
        for (int idx = 0; idx < code.length(); idx++) {
            if (charCode[idx] == '1') {
                mode = !mode;
                continue;
            }
            if (mode == false) {
                if (idx % 2 == 0) {
                    answer += String.valueOf(charCode[idx]);
                }
            } else {
                if (idx % 2 == 1) {
                    answer += String.valueOf(charCode[idx]);
                }
            }
        }

        if (answer.equals("")) {
            return "EMPTY";
        }
        
        return answer;
    }
}
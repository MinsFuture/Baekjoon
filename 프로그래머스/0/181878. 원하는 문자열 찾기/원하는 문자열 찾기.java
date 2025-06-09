class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        if(myString.contains(pat.toLowerCase())){
            return 1;
        } else{
            return 0;
        }
    }
}
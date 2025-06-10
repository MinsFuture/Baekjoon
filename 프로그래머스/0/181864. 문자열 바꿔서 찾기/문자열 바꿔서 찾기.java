class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A", "C");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("C", "B");
        if(myString.contains(pat)){
            return 1;
        }
        
        return 0;
    }
}
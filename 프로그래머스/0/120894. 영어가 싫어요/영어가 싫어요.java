class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] list = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i<10; i++){
            numbers = numbers.replaceAll(list[i], String.valueOf(i));            
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
}
def solution(num_str):
    answer = 0
    
    for digit in num_str:
        answer += int(digit)
    
    return answer
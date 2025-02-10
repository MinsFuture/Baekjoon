def solution(numbers):
    max_num = max(numbers)
    numbers.remove(max_num)
    max_num2 = max(numbers)
    
    return max_num * max_num2
    

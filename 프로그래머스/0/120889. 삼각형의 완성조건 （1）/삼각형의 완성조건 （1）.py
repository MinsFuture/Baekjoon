def solution(sides):
    answer = 0
    
    max_num = max(sides)
    sides.remove(max_num)
    
    if ((sides[0] + sides[1]) > max_num):
        answer = 1
    else:
        answer = 2
    
    return answer
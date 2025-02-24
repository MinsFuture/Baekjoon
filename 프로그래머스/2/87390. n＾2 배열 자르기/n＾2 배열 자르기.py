def solution(n, left, right):
    answer = []
    
    for i in range(left, right + 1):
        max_num = max((i//n, i%n))
        answer.append(max_num + 1)
    
    # left = 2, right = 5 -> 2 3 4 5
    # 현재값이 2이다 -> 2/n행에 2%n열이다
    
    # 1 2 3 
    # 2 2 3 
    # 3 3 3 
    

    return answer 
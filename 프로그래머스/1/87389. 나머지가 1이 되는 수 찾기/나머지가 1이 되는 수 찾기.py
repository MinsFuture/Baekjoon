def solution(n):
    answer = 0
    
    if n % 2 == 1:
        answer = 2
    else:
        for i in range(1, n+1):
            if n % i == 1:
                answer = i
                break;
    
    return answer
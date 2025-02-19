def solution(n):
    answer = 0
    
    if (n ** (1/2)).is_integer():
        return ((n ** (1/2)) + 1) ** 2
    
    return -1
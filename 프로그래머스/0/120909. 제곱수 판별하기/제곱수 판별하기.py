def solution(n):
    sqrt_num = int(n ** (1/2))
    if(sqrt_num ** 2 == n):
        return 1
    else:
        return 2
 
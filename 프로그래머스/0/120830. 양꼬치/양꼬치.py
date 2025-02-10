def solution(n, k):
    sum = 0
    sum += n * 12000
    sum += (k-(n//10)) * 2000
    return sum
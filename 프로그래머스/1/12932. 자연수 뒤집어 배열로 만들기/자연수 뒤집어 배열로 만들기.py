def solution(n):
    answer = []
    a = list(str(n))
    
    for i in range(0, len(a)):
        answer.append(int(a[len(a) - 1 -i]))
        
    return answer
def solution(n):
    answer = 0
    
    df = list(str(n))
    df.sort(reverse = True)
    
    ten = pow(10, (len(df) - 1))
    for i in df:
        answer += int(i) * ten
        ten /= 10
        
    return answer
def solution(s):
    answer = 0
    
    if s.startswith('-'):
        answer = int(s[1:]) * -1
    else:
        answer = int(s)
    
    return answer
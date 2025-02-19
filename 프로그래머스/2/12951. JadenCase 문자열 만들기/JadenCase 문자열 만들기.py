def solution(s):
    answer = []
    
    a = s.split(' ')
    
    for i in a:
        answer.append(i.capitalize())
    
    return " ".join(answer)
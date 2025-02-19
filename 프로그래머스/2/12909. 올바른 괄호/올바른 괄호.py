def solution(s):
    answer = True
    a = []
    for i in s:
        if i == '(':
            a.append(i)
        else:
            if len(a) == 0:
                return False
            a.pop()
            
    if len(a) == 0:
        return True
    
    return False
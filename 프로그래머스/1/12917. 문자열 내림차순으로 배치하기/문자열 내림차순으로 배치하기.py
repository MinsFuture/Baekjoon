def solution(s):
    answer = ''
    list1 = list(s)
    list1.sort(reverse = True)
    
    for i in list1:
        answer += i
    
    return answer
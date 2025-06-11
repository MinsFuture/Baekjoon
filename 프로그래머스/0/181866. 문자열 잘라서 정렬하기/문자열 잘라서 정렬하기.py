def solution(myString):
    answer = []
    
    answer = myString.split('x')
    while '' in answer:
        answer.remove('')
            
    answer.sort()
    
    return answer
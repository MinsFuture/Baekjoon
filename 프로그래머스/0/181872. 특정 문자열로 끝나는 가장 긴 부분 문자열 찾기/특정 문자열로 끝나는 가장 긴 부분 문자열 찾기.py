def solution(myString, pat):
    answer = ''
    
    max = 0
    
    for i in range(len(myString) - len(pat), -1, -1):
        if myString[i:i+len(pat)] == pat:
            max = i + len(pat) - 1
            break
            
    answer = myString[:max+1]
    
    return answer
def solution(strArr):
    answer = []
    
    for i in range(len(strArr)):
        if i % 2 == 0:
            answer.append(strArr[i].lower())
            continue
        answer.append(strArr[i].upper())
    
    return answer
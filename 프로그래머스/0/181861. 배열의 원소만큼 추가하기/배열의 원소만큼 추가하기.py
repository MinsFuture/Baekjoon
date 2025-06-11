def solution(arr):
    answer = []
    
    for el in arr:
        for i in range(el):
            answer.append(el)
    
    return answer
def solution(arr, flag):
    answer = []
    
    
    
    for idx, j in enumerate(flag):
        if j:
            for i in range(arr[idx] * 2):
                answer.append(arr[idx])
        else:
            for i in range(arr[idx]):
                answer.pop()
                
    
    return answer
def solution(arr, queries):
    answer = arr.copy()
    
    for q in queries:
        for i in range(q[0], q[1]+1):
            answer[i] += 1;
    
    return answer
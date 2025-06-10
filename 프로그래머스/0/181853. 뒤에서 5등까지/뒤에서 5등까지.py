def solution(num_list):
    answer = []
    
    a = sorted(num_list)
    for i in range(5):
        answer.append(a[i])
    
    return answer
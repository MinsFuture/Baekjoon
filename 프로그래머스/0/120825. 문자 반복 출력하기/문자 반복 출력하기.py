def solution(my_string, n):
    a = list(my_string)
    answer = []
    for i in range(0, len(my_string)):
        for j in range(0, n):
            answer.append(a[i])
    
    return ''.join(answer)

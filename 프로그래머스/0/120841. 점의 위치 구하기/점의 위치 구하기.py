def solution(dot):
    answer = 0
    a = dot[0]
    b = dot[1]
    if (a > 0) & (b > 0):
        answer = 1
    elif (a<0) & (b > 0):
        answer = 2
    elif (a<0) & (b <0):
        answer = 3
    else:
        answer = 4
    return answer
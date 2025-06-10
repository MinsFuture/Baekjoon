def solution(arr, n):
    answer = arr

    for i in range(len(arr)):
        if (len(arr) % 2 == 0) and (i % 2 == 1):
            answer[i] += n
        elif (len(arr) % 2 != 0) and (i % 2 == 0):
            answer[i] += n

    return answer

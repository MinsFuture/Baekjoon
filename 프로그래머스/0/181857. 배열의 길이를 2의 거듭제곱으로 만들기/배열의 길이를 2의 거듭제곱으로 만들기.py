def solution(arr):
    length = len(arr)
    power = 1
    
    # 2의 거듭제곱 이상이 될 때까지 곱하기
    while power < length:
        power *= 2
    
    # 필요한 만큼 0을 뒤에 추가
    return arr + [0] * (power - length)

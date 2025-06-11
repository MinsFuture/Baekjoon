def solution(my_string, indices):
    answer = []
    for idx, ch in enumerate(my_string):
        if idx not in indices:
            answer.append(ch)
    return ''.join(answer)  # 리스트 → 문자열로 변환

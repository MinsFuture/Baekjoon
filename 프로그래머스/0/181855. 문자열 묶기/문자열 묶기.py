def solution(strArr):
    length_count = {}

    for s in strArr:
        key = str(len(s))  # 길이를 문자열로 변환해서 키로 사용
        if key not in length_count:
            length_count[key] = 0
        length_count[key] += 1

    return max(length_count.values())

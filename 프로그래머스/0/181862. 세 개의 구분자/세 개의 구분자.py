def solution(myStr):
    import re
    # 정규표현식으로 a, b, c 중 하나를 구분자로 split
    parts = re.split('[abc]', myStr)
    
    # 빈 문자열 제거
    result = [p for p in parts if p]
    
    # 결과가 비어 있으면 ["EMPTY"]
    return result if result else ["EMPTY"]
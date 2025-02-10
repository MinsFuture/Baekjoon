def solution(str1, str2):
    if str1 == str2:
        return 1
    elif len(str2) > len(str1):
        return 2
    
    for i in range(0, len(str1) - len(str2) + 1):
        flag = True
        index = 0
        for j in range(i, i + len(str2)):
            if str1[j] != str2[index]:
                flag = False
            index += 1
        if flag:
            return 1
                
    return 2
def solution(my_string, letter):
    a = list(my_string)
    while letter in a:
        a.remove(letter)
    
    return ''.join(a)
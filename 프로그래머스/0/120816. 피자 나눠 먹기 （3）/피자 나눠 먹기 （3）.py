def solution(slice, n):
    answer = n % slice
    if answer == 0:
        return n // slice
    else:
        return n // slice + 1
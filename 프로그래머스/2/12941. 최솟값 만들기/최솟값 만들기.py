import sys

def solution(A,B):
    A.sort()
    B.sort(reverse = True)
    min = 0
    
    for i in range(0, len(A)):
        min += A[i] * B[i]
            
    return min
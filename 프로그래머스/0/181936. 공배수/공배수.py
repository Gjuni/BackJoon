def solution(number, n, m):
    answer = 0
    
    num1 = number%n
    num2 = number%m
    
    if num1 == 0 and num2 == 0:
        answer = 1
    else :
        answer = 0
    return answer
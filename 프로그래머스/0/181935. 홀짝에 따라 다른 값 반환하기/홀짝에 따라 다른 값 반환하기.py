def solution(n):
    answer = 0
    
    if n%2 == 1 : # 홀수라면
        for i in range(1,n+1,2):
            print(i)
            answer += i
    else:  # 짝수라면
        for i in range(2,n+1,2):
            print(i)
            answer += i*i
    
    return answer
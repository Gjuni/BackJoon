# 입력 받기
N = int(input())

# 팩토리얼 계산 함수
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)

# 팩토리얼 출력
print(factorial(N))

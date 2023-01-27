arr = []
num = 0

arr = list(map(int,input().split()))
    
for i in range(0,5,1):
    num += arr[i]**2

num = num%10

print(num)
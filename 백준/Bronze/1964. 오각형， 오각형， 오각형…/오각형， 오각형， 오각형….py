# 5 12 22 35
#  7  10  13

num = int(input())
total = 5
idx = 7

for i in range(num-1) :
    if(num == 1) :
        print(total)
        break
    else :
        total += idx
        idx += 3
        
print(total%45678)
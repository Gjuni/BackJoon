num1,num2 = (map(list,input().split()))

num1[0], num1[2] = num1[2], num1[0]
num2[0], num2[2] = num2[2], num2[0]

str1 = ""
str2 = ""
for i in range(0, 3, 1):
    str1 += num1[i]
    str2 += num2[i]

num1 = int(str1)
num2 = int(str2)

if(num1 > num2):
    print(num1)
elif(num2 > num1):
    print(num2)

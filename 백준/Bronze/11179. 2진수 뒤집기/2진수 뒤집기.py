def reverse_binary(n):
    binary_rep = bin(n)[2:]  
    reversed_binary_rep = binary_rep[::-1] 
    return int(reversed_binary_rep, 2) 

n = int(input())

print(reverse_binary(n))
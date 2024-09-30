import sys

_value = 0

def solved(_size, _colums, _row):
    global _value  
    
    if _size == 0:
        return _value
    
    times_num = 0 
    
    if _colums >= 2**(_size - 1) and _row >= 2**(_size - 1):
        times_num = 3
    elif _colums < 2**(_size - 1) and _row < 2**(_size - 1):
        times_num = 0
    elif _colums >= 2**(_size - 1) and _row < 2**(_size - 1):
        times_num = 2
    elif _colums < 2**(_size - 1) and _row >= 2**(_size - 1):
        times_num = 1

    _value += ((2**(_size - 1)) **2)* times_num
    
    return solved(_size-1, _colums%(2**(_size - 1)), _row%(2**(_size - 1)))

_size, _colums, _row = map(int, input().split())

print(solved(_size, _colums, _row))

# Day30_Q1.py
''' Arrays Hackerrank '''
import numpy 
def arrays(arr):
    arr.reverse()
    b = numpy.array(arr,float)
    return b
    
arr = input().strip().split(' ')
result = arrays(arr)
print(result)

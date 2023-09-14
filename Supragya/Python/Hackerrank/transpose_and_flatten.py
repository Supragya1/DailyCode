# Day35_Q1.py
'''transpose_and_flatten.py'''
import numpy

N, M = map(int,input().split())
b = []
for n in range(N):
    h = list(map(int, input().split()))
    b.append(h)
my_array = numpy.array(b)
print(numpy.transpose(my_array))
print(my_array.flatten())
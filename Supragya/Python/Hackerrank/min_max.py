# Day34_Q1.py
'''Min and Max'''
import numpy

M, N = map(int, input().split())

LC = [input().split() for m in range(M)]

my_array = numpy.array(LC, int)
MIN = numpy.min(my_array, axis = 1)
print(numpy.max(MIN))
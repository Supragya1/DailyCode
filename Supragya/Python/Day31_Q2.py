''' Zeros and Ones Hackerrank'''
import numpy
N = list(map(int,input().split()))
ZEROS = numpy.zeros((N),int)
ONES = numpy.ones((N),int)
print(ZEROS,ONES,sep = "\n")

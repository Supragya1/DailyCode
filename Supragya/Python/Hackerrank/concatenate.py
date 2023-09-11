# Day31_Q1.py
''' Concatenate Hackerrank'''
import numpy

N, M, P = list(map(int, input().split()))
J = []

for n in range(N+M):
    l = list(map(int, input().split()))
    J.append(l)
    
print(numpy.array(J))

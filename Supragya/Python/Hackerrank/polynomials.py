# Day36_Q1.py
'''Polynomials Hackerrank'''
import numpy
lst=list(map(float,input().split()))
b=float(input())
print(numpy.polyval(lst,b))
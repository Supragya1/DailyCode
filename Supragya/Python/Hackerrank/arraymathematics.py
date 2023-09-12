# Day33_Q1.py
''' Array mathematics Hackerrank'''
import numpy
size= tuple(map(int, input().split()))
a,b = [numpy.array([input().split() for _ in range(size[0])],int) for i in range(2)]
print(a+b, a-b, a*b, a//b, a%b,a**b, sep="\n")
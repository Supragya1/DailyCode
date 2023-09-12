# Day33_Q2.py
import numpy
n,m = map(int,input().split())
c = (numpy.eye(n,m,k=0))
numpy.set_printoptions(legacy="1.13")
print(c)
# Day38_Q1.py
'''Mean, Var, and Std Hackerrank'''
import numpy
if __name__ == "__main__":
    m,n = map(int, input().split())
    arr= numpy.array([input().split() for _ in range(m)],int)
    print(numpy.mean(arr,axis=1))
    print(numpy.var(arr,axis=0))
    print(round(numpy.std(arr,axis=None),11))
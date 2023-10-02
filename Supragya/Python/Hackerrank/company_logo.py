# Day48_Q1.py
'''Company Logo Hackerrank'''
import math
import os
import random
import re
import sys



if __name__ == '__main__':
    s = input()
ss=set(s)
ss=sorted(ss)
val=[0]
ind=[0]
for i in ss:
    a=len(re.findall(i,s))
    for j in range(len(val)):
        if a > val[j]:
            val.insert(j,a)
            ind.insert(j,i)
            break
        elif j==len(val)-1:
            val.append(a)
            ind.append(i)


for i in range(3):
    print(ind[i],val[i])
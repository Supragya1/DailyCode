# Day15_Q2.py
''' itertools.permutations() Hackerrank''' 
from itertools import permutations

s,n=input().split()
n=int(n)
vals=list(permutations(s,n))
res=[]
for x in vals:
    res.append(''.join(x))

print('\n'.join(sorted(res)))

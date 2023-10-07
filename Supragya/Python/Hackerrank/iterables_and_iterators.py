# Day54_Q1.py
'''Iterables and Iterators Hackerrank''' 
from itertools import permutations
N = int(input())
S = input().split()
K = int(input())
P = permutations(S, K)
count = total = 0
for e in P:
    total += 1
    if 'a' in e:
        count += 1        
print(count / total)

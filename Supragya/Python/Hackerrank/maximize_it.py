# Day55_Q1.py
'''Maximize It! Hackerrank'''
from itertools import product
K, M = map(int, input().split())
matrix =[list(map(int, input().split()[1:])) for _ in range(K)]
combinations = list(product(*matrix))
print(max(sum(n*n for n in c) % M for c in combinations))
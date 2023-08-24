''' itertools.combinations_with_replacement() Hackerrank'''
from itertools import combinations_with_replacement
raw = input().split()
s, k = sorted(raw[0]), int(raw[1])
for combinacion in combinations_with_replacement(s, k):
    print("".join(combinacion))

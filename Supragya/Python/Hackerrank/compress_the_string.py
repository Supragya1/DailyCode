# Day51_Q2.py
# '''compress the string Hackerrank'''
from itertools import groupby
s = input()
list_s = [(len(list(g)),int(k)) for k,g in groupby(s)]
print(" ".join(map(str,list_s)))
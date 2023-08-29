''' Hex Color Code Hackerrank'''
import re

n = int(input())

pat = r'(#[a-fA-F\d]{3,6})\S'

for _ in range(n):
    res = re.findall(pat, input())
    for data in res:
        print("".join(data))

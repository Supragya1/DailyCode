# Day51_Q1.py
'''regex subsitution Hackerrank'''
import re
n = int(input())
string = '\n'.join([input() for _ in range(n)])
print(re.sub(r"(?<=(\s))\|\|(?=(\s))", 'or', re.sub(r"(?<=(\s))&&(?=(\s))", 'and', string)))
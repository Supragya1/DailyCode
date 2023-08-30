# Day33_Q2.py
''' Re.start()_&_Re.end() Hackerrank'''
import re
S, k = input(), input()
pat = re.compile(k)
m = pat.search(S)

if m:
    while m:
        print((m.start(), m.end()-1))
        i = m.start() + 1
        m = pat.search(S, i)
else:
    print((-1, -1))

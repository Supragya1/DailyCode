''' Collections.deque() Hackerrank'''
from collections import deque
d = deque()
for _ in range(int(input())):
    method, *arg = input().split()
    getattr(d, method)(*arg)
print(" ".join(d))

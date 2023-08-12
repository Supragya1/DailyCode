''' Collections.namedtuple() Hackerrank'''
from collections import namedtuple
n = int(input())
col = namedtuple('col',input().split())
l = [int(col(*input().split()).MARKS) for i in range(n)]
print(sum(l)/n)

# Day19_Q2.py
''' Set .union() Operation Hackerrank'''
n = int(input())
s1 = set(map(int , input().split()))
m = int(input())
s2 = set(map(int ,input().split()))
print(len(s1.union(s2)))

# Day27_Q2.py
''' Set .intersection() Operation Hackerrank '''
N = int(input())
A = set(map(int, input().split()))
M = int(input())
B = set(map(int, input().split()))
set1 = A&B
print(len(set1))

# Day18_Q1.py
''' Set .add() Hackerrank'''
n=int(input())
se={''}
for i in range(n):
    se.add(input())
se.remove('')
print(len(se))

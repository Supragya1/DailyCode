# Day29_Q2.py
''' Check Strict Superset Hackerrank'''
setA = set(map(int, input().split()))
n = int(input())

is_strict_superset = True

for _ in range(n):
    inputSet = set(map(int, input().split()))
    if not setA.issuperset(inputSet):
        is_strict_superset = False
        break

print(is_strict_superset)

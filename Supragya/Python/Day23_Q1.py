''' Check Subset Hackerrank'''
testCase = int(input())
for i in range(testCase) :
    aSize = int(input())
    a = set(map(int,input().split()))
    bSize = int(input())
    b = set(map(int,input().split()))
    print(a.issubset(b))

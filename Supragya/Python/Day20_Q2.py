'''Set Mutations Hackerrank '''
n=int(input())
set1=set(map(int,input().split()))
for x in range(int(input())):
    command=input().split()
    set2=set(map(int,input().split()))
    if command[0]=="intersection_update":
        set1&=set2
    elif command[0]=="update":
        set1|=set2
    elif command[0]=="symmetric_difference_update":
        set1^=set2
    else:
        set1-=set2
print(sum(set1))

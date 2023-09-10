# Day23_Q2.py
''' The Captain's Room Hackerrank '''
import operator as op
k = int(input())
if (k >= 1000) | (k <= 1):
    raise Exception("Limit exceeded")

rooms = ([int(x) for x in str(input()).split()])
un = set(rooms)
g = len(rooms)//2
rooms1 = set(rooms[g:])
rooms2 = set(rooms[:g])
#symmetric difference of two sets
resSet=rooms1.symmetric_difference(rooms2)
if len(resSet) > 1:
    for x in resSet:        
        if op.countOf(rooms,x) == 1:
            print(x)
else:    
    print(rooms1.symmetric_difference(rooms2).pop())

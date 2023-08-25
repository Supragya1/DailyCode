''' Zipped! Hackerrank '''
stu,sub=map(int,input().split(" "))
stus=[0]*stu
x=range(1,stu+1)

for i in range(0,sub):
    subs=list(zip(x,list(map(float,input().split(" ")))))
    for j in range(0,len(subs)):
        stus[j]+=subs[j][1]
        
for i in stus:
    print(i/sub)

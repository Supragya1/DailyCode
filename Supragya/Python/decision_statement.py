# Day59_Q1.py
#date 25-1-2023

# Practice code 1
"""a = int(input("Enter your number "))
for i in range(0 ,a):
    p = 3*i
    print(p)"""

# Practice code 2
'''n = int(input("Enter the number of rows "))
for i in range(1,5):
    p=3
    q=3+i
    print(q,p)
else:
    print("We are in else block")'''

# Practice code 3
'''ran =int(input("Enter the range "))
for i in range(ran,0,-1):
    p=3*i
    print(p)'''

# Practice code 4
'''for i in range(1,5):
    print(i,end=" ")'''

# Practice code 5
'''for i in range(0,10,2):
    print("We are in outer loop ")
    for j in range(0,i):
        print("We are in inner loop")
        print(i," ",j)'''

# Practice code 6
'''i=10
while(i>=0):
    print("i",i)
    j=i
    while (j>=2 and j<=5):
        print("j",j)
        j=j-1
    else:
        print("inner else block")
    i=i-2
else:
    print("outer else block")'''

# Practice code 7
# (PATTERN PRINTING)
# Number loop in loop in loop
'''n = int(input("Enter the number of rows "))
for i in range(1,(2*n)):
    for j in range(1,(2*n)):
        for k in range(1,n+1):
            if(i==k or j== k or i==2*n-k or j==2*n-k):
                print(n-k+1, end= "")
                break
    print(end="\n")  '''

# Practice code 8
'''rows =int(input("Enter number of rows "))
for i in range(0,rows+1):
    for j in range(0,rows-i):
        print(end=" ")
    for j in range(0,2*i-1):
        print(end="*")
    print(end="\n")

for i in range(rows-1,0,-1):
    for j in range(0,rows-i):
        print(end=" ")
    for j in range(0,2*i-1):
        print(end="*")
    print(end="\n")'''


# Day58_Q2.py
'''Decision control and loops
Sequential control
Conditional control or selection control
Iterative control'''
'''#Practice Code 1
n=10
print("The value of n:",n)
print("Hello Upes")'''

#Practice Code 2
'''n=10
print("The value of n:",n)
if (n>=10):
    print("WE ARE IN IF BLOCK")
    print("PRESS TAB TO INCLUDE THE STATEMENT IN IF BLOCK")
print("THIS STATEMENT IS NOT INCLUDED IN IF BLOCK")'''

#Practice Code 3
'''n = int(input("ENTER the value of n "))
print("The value of n is ",n)
if (n>=10 or n==5 or n==1 ):
    print("WE are in if block")
    print("Value of n is in next line")
print("The value of n is ", n)'''

#Practice Code 4
'''n = int(input("ENTER the value of n "))
print("The value of n is ",n)
if not(n>=10):
    print("hi")
    print("Hello")
print("The value of n is ",n)'''

#Practice Code 5
'''n = int(input("ENTER the value of n "))
print("The value of n is ",n)
if (n>=10):
    print("We are in if block")
else :
    print("We are in else block")
print("We are in neither if nor else block")'''

#Practice Code 6
'''n = int(input("ENTER the value of n "))
print("The value of n is ",n)
if(n%2==0):
    print("n is even number")
else :
    print("n is odd")'''

#Practice Code 7
'''n = int(input("ENTER the value of n "))
print("The value of n is ",n)
if(n>=18):
    print("You are an adult")
else:
    print("You are not an adult")
'''
#Practice Code 8
'''n = int(input("ENTER the value of n "))
print("The value of n is ",n)
if(n>=33):
    print("pass")
else:
    print("FAIL")'''

#Practice Code 9
'''a = int(input("ENTER the value of a "))
b = int(input("ENTER the value of b "))
if(a>b):
    print("a is the biggest number")
else:
    print("b is the  biggest number")'''

#Practice Code 10
'''a = int(input("ENTER the value of a "))
b = int(input("ENTER the value of b "))
c = int(input("ENTER the value of c "))
if(a>b):
    if(a>c):
        print("a is the biggest number")
    else:
        print("c is the biggest number")
else :
    if(b>c):
        print("b is the biggest number")
    else:
        print("c is the biggest number")'''

#Practice Code 11
'''a = int(input("ENTER the value of a "))
b = int(input("ENTER the value of b "))
c = int(input("ENTER the value of c "))
if(a>b):
    if(a>c):
        print("a is the biggest number")
    else:
        print("c is the biggest number")
elif (b>c):
     print("b is the biggest number")
else:
    print("c is the biggest number")'''

#Practice Code 12
'''a= int(input("Enter the value of a "))
if(a>0 and a<10):
    print("The value of a is in range of 0 to 10")
elif(a>10 and a<20):
     print("The value of a is in range of 10 to 20")
elif(a>20 and a<30):
     print("The value of a is in range of 20 to 30")
else:
    print("The value of a is greater then 30")
print("Out of if-elif block")'''

#Practice Code 13
'''a= int(input("Enter the year "))
if(a%400==0):
    print("Leap Year")
elif(a%100==0):
    print("Not Leap year")
elif(a%4==0):
    print("Leap Year")
else:
    print("Not Leap Year")'''

#Practice Code 14
# While loop
'''n=10
while(n>=0):
    print("The value of n :",n)
    n-=1
print("We are out of Loop")'''

#Practice Code 15
n=10
while(n<=50):
    print("The value of n :",n)
    n+=10
else:
    print("We are in else block of while loop")

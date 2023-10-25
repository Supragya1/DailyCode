# Day62_Q2.py
#Practice Code 1
'''num_list=[1,2,3,4,5,6,7,8,9,10]
it= iter(num_list)
for i in range(len(num_list)):
  print("Element at index ", i , "is : ", 3*next(it))'''  


#Practice Code 2 filter fun
'''def func(x):
    if(x%2==0):
        return 1
list1=[1,2,3,4,5,6,7,8,9,10]
it = iter(list1)

#for i in range(len(list1)):
print(list(filter(func,range(2,20))))'''

#Practice Code 3 filter fun
'''def func(x):
    for i in range(2,x):
        if(x%i==0):
            return 0
    return 1
print(list(filter(func,range(2,25))))'''


#Practice Code 4 map fun
'''def sub2(x):
    x*=2
    return x
list1=[1,2,3,4,5,6]
print(list(map(sub2,list1)))'''

#Practice Code 5 map fun
'''def add(x):
    x+=2
    return x
list1=[1,2,3,4,5,6]
print(list(map(add,list1)))'''

#Practic Code 6 reduce fun
'''import functools
def add(x,y):
    return x+y
list1=[10,20,30,40,50,60]
print(functools.reduce(add,list1))'''

#Practic Code 7 reduce fun
'''import functools
def factorial(x,y):
    return x*y
n=int(input("Enter the number you want to find factorial of : "))
print(functools.reduce(factorial,range(1,n+1)))'''

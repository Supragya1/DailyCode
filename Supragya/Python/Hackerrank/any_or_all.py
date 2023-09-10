# Day24_Q1.py
''' Any or All Hackerrank '''
N =  int(input())
M = input().split()
positive = all(int(i)>0 for i in M)
palindromic = any(i == i[::-1] for i in M)
if positive and palindromic:
    print("True")
else:
    print("False")

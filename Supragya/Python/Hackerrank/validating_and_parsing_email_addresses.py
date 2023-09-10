# Day32_Q1.py
''' Validating and Parsing Email Addresses Hackerrank'''
import email.utils
import re

p = re.compile(r'<[a-z][\w\.-]*@[a-z]+\.[a-z]{1,3}>', re.I)

for i in range(int(input())):
    lol, ine = input().split()
    if re.match(p, ine):
        print(lol, ine)

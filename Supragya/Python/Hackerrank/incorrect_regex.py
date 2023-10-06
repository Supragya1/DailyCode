# Day53_Q2.py
'''Incorrect Regex Hackerrank'''
import re

def check_regex_validity(s):
    try:
        re.compile(s)
        return True
        
    except re.error:
        return False

t = int(input())

for _ in range(t):
    s = input()
    result = check_regex_validity(s)
    print(result)
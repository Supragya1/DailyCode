# Day33_Q1.py
''' Re.findall() & Re.finditer() Hackerrank'''
import re

pattern = re.compile(r"(?<=[qwrtypsdfghjklzxcvbnm])([aeiou]{2,})(?=[qwrtypsdfghjklzxcvbnm])", re.I)
m = re.findall(pattern,input())
if m:
    print("\n".join(m))
else:
    print(-1)

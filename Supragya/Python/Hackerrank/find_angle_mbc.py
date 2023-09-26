# Day43_Q1.py
'''Find Angle MBC Hackerrank'''
import math
AB = int(input())
BC = int(input())
angle = math.degrees(math.atan2(AB,BC))
print(round(angle),'\N{DEGREE SIGN}',sep = '')
# Day16_Q1.py
''' Calendar Module Hackerrank '''
import calendar
month, day, year = list(map(int,input().split()))
ans = calendar.weekday(year, month, day)
print((calendar.day_name[ans]).upper())

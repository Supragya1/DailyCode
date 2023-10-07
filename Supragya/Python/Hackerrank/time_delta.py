# Day54_Q2.py
# '''Time Delta Hackerrank'''
from datetime import datetime
from zoneinfo import ZoneInfo
def parse_date_to_seconds(date_str):
    utc = ZoneInfo('UTC')
    dt = datetime.strptime(date_str, '%a %d %b %Y %H:%M:%S %z')
    dt_utc = dt.astimezone(utc)
    time_difference = dt_utc - datetime(1, 1, 1, tzinfo=utc)
    return int(time_difference.total_seconds())
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        t1, t2 = input(), input()
        delta = abs(parse_date_to_seconds(t1) - parse_date_to_seconds(t2))
        print(delta)
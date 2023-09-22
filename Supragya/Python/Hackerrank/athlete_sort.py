# Day40_Q2.py
''' Athlete Sort Hackerrank '''
import math
import os
import random
import re
import sys
if __name__ == '__main__':
    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    k = int(input())
    for row in sorted(arr, key=lambda x: x[k]):
        print(' '.join(map(str,row)))
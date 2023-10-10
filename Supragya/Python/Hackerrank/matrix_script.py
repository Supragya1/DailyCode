# Day56_Q1.py
'''Matrix Script Hackerrank'''
#!/bin/python3

import math
import os
import random
import re
import sys
first_multiple_input = input().rstrip().split()
n = int(first_multiple_input[0])
m = int(first_multiple_input[1])
matrix = []
for _ in range(n):
    matrix_item = input()
    matrix.append(matrix_item)
zipped_input = list(map(list, (zip(*matrix))))
matrix_string = "".join(["".join(characters) for characters in zipped_input])
replaced_string = re.sub(r'(?<=[A-Za-z0-9])[^A-Za-z0-9]+(?=[A-Za-z0-9])', ' ', matrix_string)
print(replaced_string)
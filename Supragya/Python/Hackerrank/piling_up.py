# Day45_Q2.py
# '''Piling Up Hackerrank'''
import sys


def sort_check(elems):
    n = len(elems)
    for i in range(n - 1):
        if elems[i] > elems[i + 1]:
            return False
    return True


def multi_check(elems):
    max_value = max(elems)
    first_value, last_value = elems[0], elems[-1]
    return max_value == first_value or max_value == last_value


num_stacks = int(sys.stdin.readline().strip())

for _ in range(num_stacks):
    num_elems = int(sys.stdin.readline().strip())
    elems = list(map(int, sys.stdin.readline().split()))

    if sort_check(elems) or multi_check(elems):
        sys.stdout.write("Yes\n")
    else:
        sys.stdout.write("No\n")

sys.stdout.flush()
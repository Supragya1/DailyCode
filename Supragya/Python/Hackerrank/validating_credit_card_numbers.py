# Day52_Q2.py
# '''Validating Credit Card Numbers Hackerrank'''
import re
n_cards = int(input())
for n in range(n_cards):
    is_vald = bool(re.match(r'^(?=(?:\D*\d){16}$)(?!.*(\d)(?:-?\1){3})[456]\d{3}-?\d{4}-?\d{4}-?\d{4}$', input()))
    print("Valid" if is_vald else "Invalid")
# Day44_Q1.py
'''Validating Roman Numerals Hackerrank'''
regex_pattern = r"^(?!$)M{0,3}(CD|CM|D?C{0,3})(XL|XC|L?X{0,3})(IV|IX|V?I{0,3})$"

import re
print(str(bool(re.match(regex_pattern, input()))))
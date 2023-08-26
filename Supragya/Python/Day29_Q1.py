''' Group(), Groups() & Groupdict() Hackerrank '''
import re
pattern = re.compile(r'([A-Za-z0-9])(\1)')
s = input()
if pattern.search(s):
    print(pattern.search(s).group(1))
else:
    print(-1)

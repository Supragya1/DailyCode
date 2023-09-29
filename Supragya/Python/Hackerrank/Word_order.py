# Day45_Q1.py
'''Word Order Hackerrank'''
m = {}
for _ in range(int(input())):
    word = input()
    m[word] = m.get(word,0) + 1

print(len(m))
print(*m.values())
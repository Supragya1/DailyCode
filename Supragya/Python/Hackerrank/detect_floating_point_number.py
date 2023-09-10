# Day25_Q2.py
''' Detect Floating Point Number Hackerrank '''
N = int(input())
for n in range(N):
    try:
        H = False
        J = input()
        if J != "0":
            float(J)
            H = True
    except ValueError as e:
        H = False
    print(H)

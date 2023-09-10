# Day24_Q2.py
''' Validating phone numbers Hackerrank '''
for i in range(int(input())):
    f = input()
    if f[0] in ["7","8","9"] and len(f) == 10:
        try:
            g=int(f)
            print("YES")
        except ValueError as e:
            print("NO") 
    else:
        print("NO")

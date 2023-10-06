# Day52_Q1.py
'''Validating UID Hackerrank'''
T=int(input())
for _ in range(T):
    cid=input().strip()
    if (len(cid)== 10):
        if cid.isalnum():
            if (len(set(cid))==10):
                upper=0
                digi=0
                for x in (tuple(cid)):
                    if x.isupper():
                        upper+=1
                    if x.isdigit():
                        digi+=1
                if upper>=2 and digi >=3:
                    print("Valid")
                else:
                    print("Invalid")
            else:
                print("Invalid")
        else:
            print("Invalid")
    else:
        print("Invalid")
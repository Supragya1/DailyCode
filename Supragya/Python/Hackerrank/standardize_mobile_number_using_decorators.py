# Day38_Q2.py
'''Standardize Mobile Number Using Decorators Hackerrank'''
def wrapper(f):
    def fun(l):
        formatted = []
        for number in l:
            formatted.append(f"+91 {number[-10:-5]} {number[-5:]}")
        f(formatted)
    return fun
@wrapper
def sort_phone(l):
    print(*sorted(l), sep='\n')

if __name__ == '__main__':
    l = [input() for _ in range(int(input()))]
    sort_phone(l) 

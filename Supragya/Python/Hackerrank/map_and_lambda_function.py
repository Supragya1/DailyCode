# Day25_Q1.py
''' Map and Lambda Function Hackerrank '''
cube = lambda x:x**3 
def fibonacci(n):
    res = []
    for n in range(0,n):
        if n < 2:
            res.append(n)
        else:
            res.append(res[(n-2)] + res[(n - 1)])
    return res

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))

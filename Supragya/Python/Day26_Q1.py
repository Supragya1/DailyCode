''' Input() Hackerrank '''
values = list(map(int, input().split()))
P = input()
P = P.replace('x', str(values[0]))
print(True if eval(P) == values[1] else False)

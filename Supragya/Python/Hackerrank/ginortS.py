# Day46_Q2.py
'''ginortS Hackerrank'''
sort_order = list('abcdefghijklamnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1357902468')
print(''.join(sorted(input(),key = (lambda x: sort_order.index(x)))))
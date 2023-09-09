# Day5_Q1.py
'''Nested Lists in Hackerrank'''
if __name__ == '__main__':
    marks=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        marks.append([name,score])
    scr=[x[1] for x in marks]
    min_li = sorted(set(scr))
    stud = sorted([y[0] for y in marks if y[1]==min_li[1]])
    [print(k) for k in stud]

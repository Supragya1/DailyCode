# Day4_Q2.py
# Finding The Percentage Hackerrank
if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    result = list(student_marks[query_name])    
    per = sum(result)/len(result);
    print("%.2f" % per); 
        

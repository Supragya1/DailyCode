# Day5_Q2.py
''' String Split and Join hackerrank'''
def split_and_join(line):
    line = line.split(" ")
    line = "-".join(line)
    return line

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
    

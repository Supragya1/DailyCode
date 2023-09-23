# Day41_Q2.py
'''Merge the Tools Hackerrank '''
def merge_the_tools(string, k):

    while string:
        temp = ''
        chunk, string = string[:k], string[k:]
        for i in chunk:
            if i not in temp:
                temp += i
        print(temp)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
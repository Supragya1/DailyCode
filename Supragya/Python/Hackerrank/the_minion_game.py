# Day55_Q2.py
# '''The Minion Game Hackerrank'''
def minion_game(string):
    stuart = 0
    kevin = 0

    for x in range(len(string)):
        if string[x] in "AEIOU":
            kevin += len(string)-x
        else:
            stuart += len(string)-x
                
    if stuart > kevin:
        print(f"Stuart {stuart}")
    elif stuart < kevin:
        print(f"Kevin {kevin}")
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)
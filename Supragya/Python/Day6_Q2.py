''' Mutation Hackerrank'''
def mutate_string(string, position, character):
    x = [i for i in string]
    x[position] = character
    return ''.join(x)

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)

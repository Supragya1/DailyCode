# Day39_Q1.py
''' Words Score Hackerrank '''
def is_vowel(letter):
    return letter in ['a', 'e', 'i', 'o', 'u', 'y']

def score_words(words):
    a = ['a', 'e', 'i', 'o', 'u','y']
    b = []
    for i in words:
        c = 0
        for j in i:
            if j in a:
                c += 1
        if c %2 == 0:
            b.append(2)
        else:
            b.append(1)
    return sum(b)


n = int(input())
words = input().split()
print(score_words(words))
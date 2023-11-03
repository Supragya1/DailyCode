# Day65_Q1.py
# Write a program to input a sentence and return the count of each word in the sentence.
def count_words(str):
    count = dict()
    words = str.split()
    for word in words:
        if word in count:
            count[word] += 1
        else:
            count[word] = 1
    return count
str = input("Enter a string: ")
result = count_words(str)
print(result)

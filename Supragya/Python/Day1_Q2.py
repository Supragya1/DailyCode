# Write a Python program that takes a sentence as input and prints the reverse of each word in the sentence. 
# For example, if the input is "Hello World!", the output should be "olleH dlroW!"
sentence = input("Enter a sentence ")
sentence = sentence.split()
for word in sentence:
    reverse_word = word[::-1]
    print(reverse_word ,end=" ")
  

# Day60_Q1.py
# Practice code 1
'''str1 = "Hello World"# indexing of string from 0  from left to right and from -1 from right to left
num = 10
print(type(num))
print(type(str1))
str2 = str(num)
print(type(str2))
print(str1[0])
print(str1[6])
print(str1[-1])
print(str1[-5])
print(str1[0:4])#print from 0 index to 3 ie n-1 
print(str1[2:9])'''

#Practice code 2
'''str1 = "Hello World"
index=0
for i in str1:
    print("str1[",index,"]",i)
    index+=1'''

#Practice code 3
'''str1 = "Hello World"
for i in range(len(str1)):
    print("str1[",i,"]=",str1[i])'''

#Practice code 4
'''str1 = "Hello World"
for i in str1:
    print(i)'''
#Practice code 5
'''first_name = "Supragya"
last_name ="Gandotra"
full_name= first_name +" "+last_name #catenation
print(full_name)  
print(full_name *3) #ampetation
print(id(last_name)) #prints address'''

#Practice code 6
'''name = "Supragya "
age = 19
print("Name : %s and  age: %d" %(name,age))'''

#Practice code 7
'''msg = "today is a sunny day"
print(msg.capitalize())
print(msg.title())
print(msg.upper())
print(msg.lower())
print(msg.center(50,'$'))
print(msg.count("a",0,len(msg)))
print(msg.endswith("ay",0,len(msg)))
print(msg.find("day",0,len(msg)))
print(msg.find("dey",0,len(msg)))
print(msg.index("day",0,len(msg)))
#print(msg.index("dey",0,len(msg)))
print(msg.rfind("day",0,len(msg)))
print(msg.rindex("day",0,len(msg)))
print(msg.isalnum())
print(msg.isalpha())
print(msg.isspace())
print(msg.isdigit())
print(msg.islower())
print(msg.isupper())
print(msg.ljust(50,'*'))'''
# Day61_Q1.py
# Practice Code 1
'''list1 = [1,5,69,5]
list2 = ["Hello","World","UPES"]
list3 = [10,"hello",20.6,"hi",75,'a',"World"]
list4 =[ 20.53,65.32,23.86]
list5 =[]
list5 = input("Enter the data ")
print(list1)
print(list2)
print(list3)
print(list5)
print(list1[2])
print(list3[3])
print(list3[2:4])
print(list3[:4])
list1[1]=20
print(list1)
list1.append(100) #add new element at last
list1.insert(2,100) #add new element at given position(position,number to insert)
print(list1)
del list1[3]
print(list1)'''

# Practice code 2
'''list1 = [1,56,9,4,2,6,8]
for i in range(0,6):
    if(list1[i]<list1[i+1]):
        list1[i],list1[i+1]=list1[i+1],list1[i]
print(list1)'''

# Practice code 3
'''list1 = [1,5,69,50]
list2 = ["Hello","Upes",list1,[5,9,8],"World"]
print(list2)'''

# Practice code 4
'''list1 = [1,5,69,50]
list2 = ["Hello","Upes",list1,[5,9,list1,32,[2,8,"Hi",50],8],"World"]
print(list2)'''

# Practice code 5
'''list1 = [1,56,9,4,2,6,8]
for i in range(0,6):
    if(list1[i]>list1[i+1]):
        list1[i],list1[i+1]=list1[i+1],list1[i]
print(list1)'''

# Practice code 6
'''list1 =[1,3,68,9,94,21,2,56,53,98]
for i in range(len(list1)):
    print("list1[%d]"%i,list1[i])'''

# Practice code 7
'''list1 =[1,3,68,9,94,21,2,56,53,98,0]
list2=["World","Hello"] 
list3=list1+list2
print(list3)
print(10 in list1)
print(100 not in list1)
print(max(list1))
print(min(list1))
print(sorted(list1))
print(sorted(list2))
print(sum(list1))
print(all(list1))
print(any(list1))
str1="SUPRAGYA"
list4=list(str1)
print(list4)'''
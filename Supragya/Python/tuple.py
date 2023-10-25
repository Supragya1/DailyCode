# Day63_Q1.py
#Practice Code 1
'''my_tuple = (1, 2, 3)
my_string = "hello world"
my_list = [4, 5, 6]
print("Tuple: ", my_tuple, type(my_tuple))
print("String: ", my_string, type(my_string))
print("List: ", my_list, type(my_list))

my_tuple[1] = 4  
my_string[1] = "i"  
my_list[1] = 7  

print("Tuple: ", my_tuple)
print("String: ", my_string)
print("List: ", my_list)
'''
set1 = set([1, 2, 3, 4, 5])
set2 = set([4, 5, 6, 7, 8])

print("Set1: ", set1)
print("Set2: ", set2)

set1.add(6)
set2.add(9)

set1.remove(2)
set2.discard(4)

print("Updated Set1: ", set1)
print("Updated Set2: ", set2)

union_set = set1.union(set2)
intersection_set = set1.intersection(set2)
difference_set = set1.difference(set2)
symmetric_difference_set = set1.symmetric_difference(set2)

print("Union Set: ", union_set)
print("Intersection Set: ", intersection_set)
print("Difference Set: ", difference_set)
print("Symmetric Difference Set: ", symmetric_difference_set)

subset_check = set([1, 2]).issubset(set1)
superset_check = set1.issuperset(set([1, 2]))

print("Subset Check: ", subset_check)
print("Superset Check: ", superset_check)

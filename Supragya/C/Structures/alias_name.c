// Day69_Q1
// Write a program to create a alias name for a structure and print the values of the structure members through alias name.
#include<stdio.h>
#include<string.h>
typedef struct student{
    char name[20];
    int roll;
    int marks;
} stu;
int main(){
    stu s1;
    strcpy(s1.name,"Supragya");
    s1.roll=69;
    s1.marks=100;
    struct student *ptr;
    ptr=&s1;
    printf("Name: %s\n",ptr->name);
    printf("Roll: %d\n",s1.roll);
    printf("Marks: %d\n",ptr->marks);
}
// Day55_Q1.c
// Write a C program to find the length of a string without using the library function.
#include<stdio.h>
int main(){
    char str[100];
    printf("Enter the string\n");
    gets(str);
    int count=0;
    while(str[i]!='\0'){
        count++;
    }
    printf("The length of string is %d",i);
}
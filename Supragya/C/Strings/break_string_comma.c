// Day55_Q2.c
// Write a C program to break a string into small strings by comma separated.
#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter the string\n");
    gets(str);
    char *ptr;
    ptr =strtok(str,",");
    while(ptr!=NULL){
        printf("Smaller String :%s\n",ptr);
        ptr=strtok(NULL,",");
    }
    
}

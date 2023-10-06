// Day72_Q2.c
// Write a C program to create a file.
#include<stdio.h>
#include<stdlib.h>
int main(){
    printf("Enter the name of file\n");
    char name[20];
    scanf("%s",name);
    FILE *ptr;
    ptr=fopen(name,"w");
    if(ptr==NULL){
        printf("File not created\n");
        exit(1);
    }
    printf("File created successfully\n");
    fclose(ptr);
    return 0;
}


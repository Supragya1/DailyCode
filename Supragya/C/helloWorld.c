// Day1_Q1.c
//Q1 Write a program that prompts the user to enter their name and prints "HELLO, <Name>!".
#include<stdio.h>
#include<string.h>
int main(){
    printf("Enter your name\n");
    char name[40];
    fgets(name,40,stdin);
    // printf("%d\n",strcspn(name,"\n")); 
    // strcspn returns the index of the 2nd parameter in the first parameter
    //  printf("%d\n",strcspn(name,"r"));
    name[strcspn(name,"\n")]='\0';
    printf("Hello %s!\n",name);
}

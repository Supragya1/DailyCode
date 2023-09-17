// Day54_Q1.c
// Write a C program to find the number of words in a string. Also reverse string.
#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter the string\n");
    gets(str);
    int count=0;
    for(int i=0;i<strlen(str);i++){
        if(str[i]==' '){
            count++;
        }
    }
    printf("The number of words in the string is %d\n",count+1);
    printf("The reverse of the string is\n");
    for(int i=strlen(str)-1;i>=0;i--){
        printf("%c",str[i]);
    }
    printf("\n");
}
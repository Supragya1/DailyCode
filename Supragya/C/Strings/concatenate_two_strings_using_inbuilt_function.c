// Day52_Q1.c
// Write a C program to concatenate two strings using inbuilt function.
#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100], str2[100];
    printf("Enter the first string\n");
    scanf("%s", str1);
    printf("Enter the second string\n");
    scanf("%s", str2);
    strcat(str1, str2);
    printf("The concatenated string is %s\n", str1);
}
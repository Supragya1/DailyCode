// Day52_Q2.c
// Write a C program to compare two strings using inbuilt function.
#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100], str2[100];
    printf("Enter the first string\n");
    scanf("%s", str1);
    printf("Enter the second string\n");
    scanf("%s", str2);
    int res = strcmp(str1, str2);
    if (res == 0)
    {
        printf("The strings are equal\n");
    }
    else
    {
        printf("The strings are not equal\n");
    }
}

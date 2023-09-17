// Day53_Q1.c
// Write a program to demonstrate the difference between strcpy() and strcat().
#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100], str2[100],str3[100];
    printf("Enter the first string\n");
    scanf("%s", str1);
    printf("Enter the second string\n");
    scanf("%s", str2);
    printf("Enter the third string\n");
    scanf("%s", str3);
    strcpy(str1, str2);// copy str2 to str1
    printf("The string after copying is %s\n", str1);
    strcat(str2, str3);// concatenate str3 to str2
    printf("The string after concatenation is %s\n", str2);
}
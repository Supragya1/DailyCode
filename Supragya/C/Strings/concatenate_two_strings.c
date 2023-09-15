// Day51_Q2.c
// Write a C program to concatenate two strings.
#include <stdio.h>
#include <string.h>
int main()
{
    char str1[100], str2[100];
    printf("Enter the first string\n");
    scanf("%s", str1);
    printf("Enter the second string\n");
    scanf("%s", str2);
    int len1 = strlen(str1);
    int len2 = strlen(str2);
    char str3[len1 + len2];
    for (int i = 0; i < len1; i++)
    {
        str3[i] = str1[i];
    }
    for (int i = 0; i < len2; i++)
    {
        str3[len1 + i] = str2[i];
    }
    printf("The concatenated string is %s\n", str3);
}
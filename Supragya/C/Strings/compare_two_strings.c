// Write a program to compare two strings without using inbuilt function.
#include <stdio.h>
int main()
{
    char str1[100], str2[100];
    printf("Enter the first string\n");
    scanf("%s", str1);
    printf("Enter the second string\n");
    scanf("%s", str2);
    int i = 0, flag = 0;
    while (str1[i] != '\0' && str2[i] != '\0')
    {
        if (str1[i] != str2[i])
        {
            flag = 1;
            break;
        }
        i++;
    }
    if (flag == 0)
    {
        printf("The strings are equal\n");
    }
    else
    {
        printf("The strings are not equal\n");
    }
}
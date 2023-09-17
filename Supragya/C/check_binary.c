// Day51_Q1.c
// C program to check the given number format is in binary or not.
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    printf("Enter the number\n");
    scanf("%s", str);
    int len = strlen(str);
    int flag = 0;
    for (int i = 0; i < len; i++)
    {
        if (str[i] != '0' && str[i] != '1')
        {
            flag = 1;
            break;
        }
    }
    if (flag == 1)
    {
        printf("The number is not in binary format\n");
    }
    else
    {
        printf("The number is in binary format\n");
    }
}
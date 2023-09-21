// Day57_Q2.c
// Write a program to replace all occurrences of a character with another in a string.
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    char ch, new_ch;
    int i;
    printf("Enter any string: ");
    gets(str);
    printf("Enter any character to be replaced: ");
    scanf("%c", &ch);
    printf("Enter new character: ");
    scanf(" %c", &new_ch);
    for (i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == ch)
        {
            str[i] = new_ch;
        }
    }
    printf("\nString after replacing '%c' with '%c': \n%s", ch, new_ch, str);
    return 0;
}
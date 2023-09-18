// Day54_Q2.c
// Write a C program to find the number of vowels, consonants, digits and white spaces in a string.
#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    printf("Enter the string\n");
    gets(str);
    int count_vowels = 0, count_consonants = 0, count_digits = 0, count_white_spaces = 0;
    for (int i = 0; i < strlen(str); i++)
    {
        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' ||
            str[i] == 'o' || str[i] == 'u' || str[i] == 'A' ||
            str[i] == 'E' || str[i] == 'I' || str[i] == 'O' ||
            str[i] == 'U')
        {
            count_vowels++;
        }
        else if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' &&
                                                     str[i] <= 'Z')
        {
            count_consonants++;
        }
        else if (str[i] >= '0' && str[i] <= '9')
        {
            count_digits++;
        }
        else if (str[i] == ' ')
        {
            count_white_spaces++;
        }
    }
    printf("The number of vowels in the string is %d\n", count_vowels);
    printf("The number of consonants in the string is %d\n", count_consonants);
    printf("The number of digits in the string is %d\n", count_digits);
    printf("The number of white spaces in the string is %d\n", count_white_spaces);
}
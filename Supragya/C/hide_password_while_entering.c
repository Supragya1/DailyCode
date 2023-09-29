// Day65_Q1.c
// Write a program to hide the password entered by the user while entering the password.
// Hint: Use getch() and putch() function.
#include <stdio.h>
#include <conio.h>
#include <string.h>
int main()
{
    char pass[20], ch;
    int i = 0;
    printf("Enter password: ");
    while (1)
    {
        ch = getch();
        if (ch == 13)
            break;
        else if (ch == 8)
        {
            if (i > 0)
            {
                i--;
                printf("\b \b");
            }
        }
        else
        {
            pass[i++] = ch;
            printf("*");
        }
    }
    pass[i] = '\0';
    printf("\nPassword: %s", pass);
    return 0;
}
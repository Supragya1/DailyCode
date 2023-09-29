// Day65_Q2.c
// Write a program to keep on asking the user to enter the password until the user enters the correct password.
// Hint: Use getch() and putch() function.
#include <stdio.h>
#include <conio.h>
#include <string.h>

int main() {
    char correct_password[] = "my_secret_password";
    char user_password[50];
    char ch;
    int i = 0;

    while (1) {
        printf("Enter the password: ");

        while (1) {
            ch = getch();
            if (ch == 13)
                break;
            else if (ch == 8) {
                if (i > 0) {
                    i--;
                    printf("\b \b");
                }
            } else {
                user_password[i++] = ch;
                printf("*");
            }
        }

        user_password[i] = '\0';

        if (strcmp(user_password, correct_password) == 0) {
            printf("\nCorrect password! Access granted.\n");
            break;
        } else {
            printf("\nIncorrect password. Please try again.\n");
            i = 0;
        }
    }

    return 0;
}

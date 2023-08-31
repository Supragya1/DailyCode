// Day36_Q1.c
/*Write a program to count the number of vowels
in a text*/
#include <stdio.h>
#include <ctype.h>

int main() {
    char ch[50];
    int count = 0, i;

    printf("Enter a text: ");
    fgets(ch, 50, stdin);

    for (i = 0; ch[i] != '\0'; i++) {
        if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
            ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
            count++;
        }
    }
    printf("Number of vowels: %d\n", count);
    return 0;
}

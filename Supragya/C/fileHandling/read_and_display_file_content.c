// Day71_Q2.c
// Write a program to read a file and display the contents on screen along with line number.
#include <stdio.h>
#include <stdlib.h>
int main()
{
    FILE *fp;
    char ch;
    int line = 1;
    char file_name[100];
    printf("Enter file name:");
    scanf("%s", file_name);
    fp = fopen(file_name, "r");
    if (fp == NULL)
    {
        printf("File does not exist..");
        exit(1);
    }
    else
    {
        ch = fgetc(fp);
        while (ch != EOF)
        {
            printf("%c", ch);
            if (ch == '\n')
            {
                printf("%d ", line);
                line++;
            }
            ch = fgetc(fp);
        }
    }
    fclose(fp);
    return 0;
}

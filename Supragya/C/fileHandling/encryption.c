// Day73_Q1.c
// Write a C program to Implement a simple encryption algorithm to encrypt the contents of a text file.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    FILE *fp1, *fp2;
    char ch;
    printf("Enter the name of file\n");
    char name[20];
    scanf("%s",name);
    getchar();
    fp1 = fopen(name, "w");
    if (fp1 == NULL)
    {
        printf("File not created\n");
        exit(1);
    }
    printf("Enter the content of file\n");
    char content[100];
    while (1)
    {
        scanf("%[^\n]", content);
        if (strcmp(content, "fclose") == 0)
        {
            break;
        }
        fprintf(fp1, "%s\n", content);
        getchar();
    }
    fclose(fp1);
    printf("File created successfully\n");
    fp1 = fopen(name, "r");
    if (fp1 == NULL)
    {
        printf("File does not exist..");
        exit(0);
    }
    printf("Enter the name of output file\n");
    char name2[20];
    scanf("%s",name2);
    getchar();
    fp2 = fopen(name2, "w");
    if (fp2 == NULL)
    {
        printf("File does not exist..");
        fclose(fp1);
        exit(0);
    }
    while (1)
    {
        ch = fgetc(fp1);
        if (ch == EOF)
            break;
        else
        {
            ch = ch + 10;
            fputc(ch, fp2);
        }
    }
    fclose(fp1);
    fclose(fp2);
    printf("Encryption complete.\n");

    // fp1 = fopen("file1.txt", "w");
    // if (fp1 == NULL)
    // {
    //     printf("File does not exist..");
    //     exit(0);
    // }
    // fp2 = fopen("file2.txt", "r");
    // if (fp2 == NULL)
    // {
    //     printf("File does not exist..");
    //     fclose(fp1);
    //     exit(0);
    // }
    // while (1)
    // {
    //     ch = fgetc(fp2);
    //     if (ch == EOF)
    //         break;
    //     else
    //     {
    //         ch = ch - 100;
    //         fputc(ch, fp1);
    //     }
    // }
    // fclose(fp1);
    // fclose(fp2);
    return 0;
}

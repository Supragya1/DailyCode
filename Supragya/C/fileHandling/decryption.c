// Day73_Q2.c
// Write a C program to Implement a simple decryption algorithm to decrypt the contents of a text file.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
    FILE *fp1, *fp2;
    char ch;
    printf("Enter the name of file you want to decrypt \n");
    char name[20];
    scanf("%s",name);
    getchar();
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
    int key;
    printf("Enter the key\n");
    scanf("%d",&key);
    while (1)
    {
        ch = fgetc(fp1);
        if (ch == EOF)
            break;
        else
        {
            ch = ch - key;
            fprintf(fp2,"%c",ch);
        }
    }
    fclose(fp1);
    fclose(fp2);
    printf("File decrypted successfully\n");
    return 0;
}
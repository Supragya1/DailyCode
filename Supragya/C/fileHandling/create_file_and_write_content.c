// Day72_Q1.c
// Write a C program to create a file and write contents into it.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(){
    printf("Enter the name of file\n");
    char name[20];
    scanf("%s",name);
    getchar();
    FILE *ptr;
    ptr=fopen(name,"w");
    if(ptr==NULL){
        printf("File not created\n");
        exit(1);
    }
    printf("Enter the content of file\n");
    char content[100];
     while (1) {
        scanf("%[^\n]", content);
        if (strcmp(content, "fclose") == 0) {
            break;
        }
        fprintf(ptr, "%s\n", content);
        getchar();
    }
    fclose(ptr);
    printf("File created successfully\n");
    return 0;
}

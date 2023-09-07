// Day44_Q2.c
// Q Write a c programm to create a stack of characters (string) and do reverse of it using string.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void push(char string[],int size, char c,int *top){
    if(*top==size-1){
        printf("Stack is Full\n");
    }
    else{
        (*top)++;
        string[*top]=c;
    }
}

char pop(char string[],int size,int *top){
    char c;
    if(*top==-1){
        printf("String is Empty\n");
    }
    else{
         c=string[*top];
         (*top)--;
         return c;
    }
}

void Display(char string[],int top){
    if(top==-1){
        printf("String is Empty\n");
    }
    else{
        printf("string is \n");
        while(top>=0){
            printf("%c",string[top]);
            top--;
        }
    }
}

void reverse(char string[],int top,int size){
    char string2[size];
    int top2=0;
    if(top==-1){
        printf("String is Empty\n");
    }
    else{
        while (top!=-1)
        {
            string2[top2]=string[top];
            top--,top2++;
        }
        printf("Reversed stack is\n");
        while(top2>=0){
            printf("%c",string2[top2]);
            top2--;
        }
    }
}

int main(){
    int size;
    printf("Enter the size of string\n");
    scanf("%d",&size);
    char string[size];
    int top=-1,n;
    char c;
    while (1) {
        printf("\nMENU\n");
        printf("1) Push\n");
        printf("2) Pop\n");
        printf("3) Display\n");
        printf("4) Reverse\n");
        printf("5) Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &n);
        switch (n) {
            case 1:
            printf("Enter the character you want to Enter\n");
            scanf(" %c",&c);
            push(string,size,c,&top);
            break;

            case 2:
            c=pop(string,size,&top);
            printf("Character poped is %c \n",c);
            break;

            case 3:
            Display(string,top);
            break;

            case 4:
            reverse(string,top,size);
            break;

            case 5:
            exit(0);
            break;

            default:
            printf("Enter the correct option\n");
            break;
        }
    }
}
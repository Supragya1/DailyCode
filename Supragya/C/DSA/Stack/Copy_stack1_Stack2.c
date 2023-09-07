// Day18_Q1.c
//Copy_stack1_Stack2
//Q Copy stack 1 into stack2 using push and pop element only
#include<stdio.h>
#include<stdlib.h>

void Push(int stack[],int size,int *top,int data){
    if(*top==size-1){
        printf("stack is full\n");
    }
    else {
        (*top)++;
        stack[*top]=data;
    }
}

int Pop(int stack[],int size,int *top){
    int temp;
    if(*top==-1){
        printf("Stack is Empty\n");
    }
    else {
        temp=stack[*top];
        (*top)--;
        return temp;
    }
}

void Display(int stack[],int top){
    int count=0;
    if(top==-1){
        printf("Stack is Empty\n");
    }
    while(top!=-1){
        printf("%d ",stack[top]);
        top--;
        count++;
    }
    printf("\nNumber of elements =%d \n",count);
}

int Peek(int stack[],int top){
    int temp;
    if(top==-1){
        printf("Stack is Empty\n");
        return -99991;
    }
    else {
        temp=stack[top];
        return temp;
    }
}

void Copy_Stack(int stack1[],int stack2[],int size,int top1,int *top2){
int element;
int t=*top2;
while(top1!=-1){
    element =  Pop(stack1,size,&top1);
    Push(stack2,size,&t,element);
}
*top2=t;
}

int main(){
    int size,data,n,num;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int stack1[size],top1=-1;
    int stack2[size],top2=-1;
while(1){
    printf("MENU\n");
    printf("1) Create a stack\n");
    printf("2) Push \n");
    printf("3) Pop\n");
    printf("4) Display\n");
    printf("5) Peek\n");
    printf("6) Copy stack 1 in stack 2\n");
    printf("7) Exit \n");
    printf("Enter your choice\n");
    scanf("%d",&n);

    switch(n){
        case 1:
        if(top1== -1){
        printf("Enter the Number of elements You wanted to enter \n");
        scanf("%d",&num);
        for(int i=0;i<num;i++){
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack1,size,&top1,data);
        }
        Display(stack1,top1);
        }
        else{
            printf("Stack Already created\n");
        }
        break;

        case 2:
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack1,size,&top1,data);
        Display(stack1,top1);
        break;

        case 3:
        data=Pop(stack1,size,&top1);
        printf("element poped is %d \n",data);
        break;

        case 4:
        Display(stack1,top1);
        break;

        case 5:
        data=Peek(stack1,top1);
        if(data!= -99991){
        printf("element on top is %d \n",data);}
        break;

        case 6:
        Copy_Stack(stack1,stack2,size,top1,&top2);
    printf("Stack 1 has been copied to Stack 2\n");
    printf("Stack 2 is:\n");
    Display(stack2,top2);
        break;

        case 7:
        exit(0);
        break;

        default:
        printf("Choose the correct Option\n");
        break;
    }
}
}

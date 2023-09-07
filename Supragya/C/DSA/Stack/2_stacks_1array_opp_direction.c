// Day19_Q1.c
// 2Stack_1array_b
//Q 2 stack in 1 array  ->  <-
//Q 2stack in 1 array divide array in two parts
//Q make 2 stacks in one programs.
#include<stdio.h>
#include<stdlib.h>

void Push(int stack[],int size,int *top1,int top2,int data){
    if(*top1==top2-1){
        printf("stack is full\n");
    }
    else {
        (*top1)++;
        stack[*top1]=data;
    }
}

int Pop(int stack[],int size,int *top1){
    int temp;
    if(*top1==-1){
        printf("Stack is Empty\n");
        return -99991;
    }
    else {
        temp=stack[*top1];
        (*top1)--;
        return temp;
    }
}

void Display(int stack[],int top1){
    int count=0;
    if(top1==-1){
        printf("Stack is Empty\n");
    }
    while(top1!=-1){
        printf("%d ",stack[top1]);
        top1--;
        count++;
    }
    printf("\nNumber of elements =%d \n",count);
}

int Peek(int stack[],int top1){
    int temp;
    if(top1==-1){
        printf("Stack is Empty\n");
        return -99991;
    }
    else {
        temp=stack[top1];
        return temp;
    }
}

void Push2(int stack[],int size,int *top2,int top1,int data){
    if(*top2== top1+1){
        printf("stack is full\n");
    }
    else {
        (*top2)--;
        stack[*top2]=data;
    }
}

int Pop2(int stack[],int size,int *top2){
    int temp;
    if(*top2==size){
        printf("Stack is Empty\n");
        return -99991;
    }
    else {
        temp=stack[*top2];
        (*top2)++;
        return temp;
    }
}

void Display2(int stack[],int top2,int size){
    int count=0;
    if(top2==size){
        printf("Stack is Empty\n");
    }
    while(top2!=size){
        printf("%d ",stack[top2]);
        top2++;
        count++;
    }
    printf("\nNumber of elements =%d \n",count);
}

int Peek2(int stack[],int top2,int size){
    int temp;
    if(top2==size){
        printf("Stack is Empty\n");
        return -99991;
    }
    else {
        temp=stack[top2];
        return temp;
    }
}

int main(){
    int size;    printf("Enter the size of array\n");
    scanf("%d",&size);
    int top1=-1,top2=size,data,n,num;

    int stack1[size];
while(1){
    printf("MENU\n");
    printf("1) Push in Stack 1\n");
    printf("2) Pop in Stack 1\n");
    printf("3) Display Stack 1\n");
    printf("4) Peek in Stack 1\n");
    printf("5) Push in Stack 2\n");
    printf("6) Pop in Stack 2\n");
    printf("7) Display Stack 2\n");
    printf("8) Peek in Stack 2\n");
    printf("9) Print Full array\n");
    printf("10) Exit \n");
    printf("Enter your choice\n");
    scanf("%d",&n);

    switch(n){
        case 1:
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack1,size,&top1,top2,data);
        Display(stack1,top1);
        break;

        case 2:
        data=Pop(stack1,size,&top1);
        if(data!= -99991){
        printf("element poped is %d \n",data);}
        break;

        case 3:
        Display(stack1,top1);
        break;

        case 4:
        data=Peek(stack1,top1);
        if(data!= -99991){
        printf("element on top is %d \n",data);}
        break;

        case 5:
        printf("Enter the data\n");
        scanf("%d",&data);
        Push2(stack1,size,&top2,top1,data);
        Display2(stack1,top2,size);
        break;

        case 6:
        data=Pop2(stack1,size,&top2);
        if(data!= -99991){
        printf("element poped is %d \n",data);}
        break;

        case 7:
        Display2(stack1,top2,size);
        break;

        case 8:
        data=Peek2(stack1,top2,size);
        if(data!= -99991){
        printf("element on top is %d \n",data);}
        break;

        case 9:
        for(int i=0;i<size;i++){
            printf("%d ",stack1[i]);
        }
        printf("\n");
        break;

        case 10:
        exit(0);
        break;

        default:
        printf("Choose the correct Option\n");
        break;
    }
}
}

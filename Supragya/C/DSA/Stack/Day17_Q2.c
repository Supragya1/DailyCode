// Stack using array
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
        return -99991;
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

int main(){
    int size,top=-1,data,n,num;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int stack[size];
while(1){
    printf("MENU\n");
    printf("1) Create a stack\n");
    printf("2) Push \n");
    printf("3) Pop\n");
    printf("4) Display\n");
    printf("5) Peek\n");
    printf("6) Is Empty\n");
    printf("7) Is Full\n");
    printf("8) Exit \n");
    printf("Enter your choice\n");
    scanf("%d",&n);

    switch(n){
        case 1:
        if(top== -1){
        printf("Enter the Number of elements You wanted to enter \n");
        scanf("%d",&num);
        for(int i=0;i<num;i++){
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack,size,&top,data);
        }
        Display(stack,top);
        }
        else{
            printf("Stack Already created\n");
        }
        break;

        case 2:
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack,size,&top,data);
        Display(stack,top);
        break;

        case 3:
        data=Pop(stack,size,&top);
        if(data!= -99991){
        printf("element poped is %d \n",data);}
        break;

        case 4:
        Display(stack,top);
        break;

        case 5:
        data=Peek(stack,top);
        if(data!= -99991){
        printf("element on top is %d \n",data);}
        break;

        case 6:
        if(top==-1){
            printf("True\n");
        }
        else{
             printf("False\n");
        }
        break;

        case 7:
        if(top== size-1){
            printf("True\n");
        }
        else{
             printf("False\n");
        }
        break;

        case 8:
        exit(0);
        break;

        default:
        printf("Choose the correct Option\n");
        break;
    }
}
}

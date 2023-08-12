//Q make 2 stacks in one programs.
//Q make 2 stacks in one programs.
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
    int size1,size2,top1=-1,top2=-1,data,n,num;
    printf("Enter the size of array1\n");
    scanf("%d",&size1);
    printf("Enter the size of array1\n");
    scanf("%d",&size2);
    int stack1[size1],stack2[size2];
while(1){
    printf("MENU\n");
    printf("1) Create a Stack 1\n");
    printf("2) Push in Stack 1\n");
    printf("3) Pop in Stack 1\n");
    printf("4) Display Stack 1\n");
    printf("5) Peek in Stack 1\n");
    printf("6) Create a Stack 2\n");
    printf("7) Push in Stack 2\n");
    printf("8) Pop in Stack 2\n");
    printf("9) Display Stack 2\n");
    printf("10) Peek in Stack 2\n");
    printf("11) Exit \n");
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
        Push(stack1,size1,&top1,data);
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
        Push(stack1,size1,&top1,data);
        Display(stack1,top1);
        break;

        case 3:
        data=Pop(stack1,size1,&top1);
        if(data!= -99991){
        printf("element poped is %d \n",data);}
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
        if(top2== -1){
        printf("Enter the Number of elements You wanted to enter \n");
        scanf("%d",&num);
        for(int i=0;i<num;i++){
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack2,size2,&top2,data);
        }
        Display(stack2,top2);
        }
        else{
            printf("Stack Already created\n");
        }
        break;

        case 7:
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(stack2,size2,&top2,data);
        Display(stack2,top2);
        break;

        case 8:
        data=Pop(stack2,size2,&top2);
        if(data!= -99991){
        printf("element poped is %d \n",data);}
        break;

        case 9:
        Display(stack2,top2);
        break;

        case 10:
        data=Peek(stack2,top2);
        if(data!= -99991){
        printf("element on top is %d \n",data);}
        break;

        case 11:
        exit(0);
        break;

        default:
        printf("Choose the correct Option\n");
        break;
    }
}
}

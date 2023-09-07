// Day44_Q1.c
//Q  multiple stack in 1 array
#include<stdio.h>
#include<stdlib.h>

void push(int stack[],int size,int top[],int num,int data,int stack_size){
    if(top[num-1]== (num*stack_size-1)){
printf("Stack in full\n");
    }
    else{
    top[num-1]++;
    stack[top[num-1]]=data;
    }  
}

int pop(int stack[],int size,int top[],int num,int stack_size){
    int t;
if(top[num-1] == (num-1)*stack_size-1){
    printf("Stack in empty\n");
}
else{
    t = stack[top[num-1]];
    top[num-1]--;
    return t;
}
}

void Display(int stack[],int size,int top[],int num,int stack_size){
if(top[num-1] == (num-1)*stack_size-1){
    printf("Stack in empty\n");
}
else{
     printf("Stack %d: ",num);
    for (int i = (num-1) * stack_size; i <=top[num-1]; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}
}

int main(){
int size,number,n,data,num;
printf("Enter the size of array\n");
scanf("%d",&size);
printf("Enter the number of stacks you wanted to create\n");
scanf("%d",&number);
int stack[size];
int stack_size = size/number;
int top[number];
for(int i=0;i<size;i++){
    stack[i]=0;
}
for(int i=0;i<number;i++){
    top[i]=(i*stack_size)-1;
}

while (1)
{   
    printf("MENU\n");
    printf("1) Push\n");
    printf("2) Pop\n");
    printf("3) Display\n");
    printf("4) Display full array\n");
    printf("5) Exit\n");
    printf("Enter your choice\n");
    scanf("%d",&n);
switch (n)
{
    case 1:
    printf("Enter the stack Number from 1 to %d \n",number); 
    scanf("%d",&num);
    printf("Enter Data\n");
    scanf("%d",&data);
    push(stack,size,top,num,data,stack_size);
    break;

    case 2:
    printf("Enter the stack Number from 1 to %d \n",number); 
    scanf("%d",&num);
    data=pop(stack,size,top,num,stack_size);
    printf("Popped element: %d\n", data);
    break;

    case 3:
    printf("Enter the stack Number from 1 to %d \n",number); 
    scanf("%d",&num);
    Display(stack,size,top,num,stack_size);
    break;

    case 4:
    for(int i=0;i<size;i++){
        printf("%d ",stack[i]);
    }
    printf("\n");
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
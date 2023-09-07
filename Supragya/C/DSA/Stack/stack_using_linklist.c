// Day17_Q1.c
// Stack using linklist
#include<stdio.h>
#include<stdlib.h>
struct Node {
    int data;
    struct Node *next;
};
struct Node *top =NULL;

void Display(){
    struct Node *t=top;
    int count =0;
    while(t!=NULL){
        printf("%d ",t->data);
        t=t->next;
        count++;
    }
    printf("\nNumber of Elements = %d \n",count);
}

void Push(int data){
    struct Node *p;
    p = (struct Node*)malloc(sizeof(struct Node));
    if(p==NULL){
        printf("stack overflow\n");
    }
    p->data=data;
    p->next=NULL;
    if(top==NULL){
    top=p;
    }
    else{
        p->next=top;
        top=p;
    }
    printf("The updated Stack is \n");
    Display();
}

int Pop(){
    struct Node *t=top;
    int temp;
    if(top==NULL){
        printf("Stack Under flow\n");
        return -99991;
    }
    else if(top->next==NULL){
        temp=top->data;
        free(top);
        top=NULL;
    }
    else {
        temp=top->data;
        top=top->next;
        free(t);
    }
    return temp;
}

int Peek(){
    int temp;
    if(top==NULL){
        printf("Stack Under flow\n");
        return -99991;
    }
    else {
        temp=top->data;
    }
    return temp;
}


int main(){
int data,n,num;
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
        if(top== NULL){
        printf("Enter the Number of elements You wanted to enter \n");
        scanf("%d",&num);
        for(int i=0;i<num;i++){
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(data);
        }
        }
        else{
            printf("Stack Already created\n");
        }
        break;

        case 2:
        printf("Enter the data\n");
        scanf("%d",&data);
        Push(data);
        break;

        case 3:
        data=Pop();
        if(data!= -99991){
        printf("element poped is %d \n",data);}
        break;

        case 4:
        Display();
        break;

        case 5:
        data=Peek();
        if(data!= -99991){
        printf("element on top is %d \n",data);}
        break;

        case 6:
        if(top==NULL){
            printf("True\n");
        }
        else{
             printf("False\n");
        }
        break;

        case 7:
        if(top!=NULL){
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

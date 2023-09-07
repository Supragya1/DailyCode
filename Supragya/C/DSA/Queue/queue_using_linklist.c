// Day20_Q1.c
// Queue using LinkList
#include<stdio.h>
#include<stdlib.h>
struct Queue{
    int data;
    struct Queue *next;
};
struct Queue *front =NULL;
struct Queue *rear =NULL;

void Enqueue(int data){
    struct Queue *p;
    p=(struct Queue*)malloc(sizeof(struct Queue));
    p->data=data;
    p->next=NULL;
    if(rear==NULL){
        rear=p;
        front=p;
    }
    else {
        rear->next=p;
        rear=p;
    }
}

int Dequeue(){
    struct Queue *t=front;
    int temp;
    if(front==NULL){
        printf("Queue is Empty\n");
        return -99991;
    }
    else if(rear==front){
        temp=front->data;
        front=NULL;
        rear=NULL;
        free(t);
        return temp;
    }
    else {
        temp=front->data;
        front=front->next;
        free(t);
        return temp;
    }
}

void Display(){
    struct Queue *t=front;
    if(front==NULL && rear==NULL){
        printf("Queue is Empty\n");
    }
    else{
        while(t!=NULL){
            printf("%d ",t->data);
            t=t->next;
        }
        printf("\n");
    }

}

int peek(){
    if(front==NULL){
        printf("Queue is Empty\n");
        return -99991;
    }
    else{
        return front->data;
    }
}

int main(){
    int data,n,x;
    while(1){
        printf("MENU\n");
        printf("1) Create\n");
        printf("2) Enqueue\n");
        printf("3) Dequeue\n");
        printf("4) Display\n");
        printf("5) Peek\n");
        printf("6) Exit\n");
        printf("Choose your desired option\n");
        scanf("%d",&n);
        switch(n){
            case 1:
            printf("Enter the number of elements You want to Enqueue\n");
            scanf("%d",&x);
            if(front==NULL){
                for(int i=0;i<x;i++){
                    printf("Enter data to Enqueue\n");
                    scanf("%d",&data);
                    Enqueue(data);
                }
                Display();
            }
            else{
                printf("Queue already created\n");
            }
            break;

            case 2:
            printf("Enter data to Enqueue\n");
            scanf("%d",&data);
            Enqueue(data);
            Display();
            break;

            case 3:
            data=Dequeue();
            if(data!=-99991){
            printf("Element pop is %d \n",data);}
            break;

            case 4:
            Display();
            break;

            case 5:
            data=peek();
            if(data!=-99991){
            printf("Element at front of queue is %d /n",data);}
            break;

            case 6:
            exit(0);
            break;
            default:
            printf("Choose the correct option\n");
            break;
        }
    }

}

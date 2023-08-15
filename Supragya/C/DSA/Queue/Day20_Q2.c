// Queue using array
#include<stdio.h>
#include<stdlib.h>
int rear =-1;
int front=-1;

void Enqueue(int Queue[],int size, int data){
    if(rear==size-1){
        printf("Queue is Full\n");
    }
    else{
        if(front==-1){
            front=0;
        }
        rear++;
        Queue[rear]=data;
    }
}

int Dequeue(int Queue[],int size){
    int temp;
    if(front==-1){
        printf("Queue is Empty\n");
        return -99991;
    }
    else if(front == rear){
        temp = Queue[front];
        front=-1;
        rear=-1;
        return temp;
    }
    else{
        temp = Queue[front];
        front++;
        return temp;
    }
}

void Display(int Queue[]){
    if(front==-1 && rear ==-1){
        printf("Queue is Empty\n");
    }
     else {
        printf("Queue is \n");
        for(int i=front;i<=rear;i++){
            printf("%d ",Queue[i]);
            
        }
        printf("\n");
     }
}

int peek(int Queue[]){
    if(front==-1 && rear ==-1){
        printf("Queue is Empty\n");
    }
     else {
        return Queue[front];
     }
}

int main(){
    int data,n,x;
    int size;
    printf("Enter the size of the array\n");
    scanf("%d",&size);
    int Queue[size];
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
            if(front==-1){
                for(int i=0;i<x;i++){
                    printf("Enter data to Enqueue\n");
                    scanf("%d",&data);
                    Enqueue(Queue,size,data);
                }
                Display(Queue);
            }
            else{
                printf("Queue already created\n");
            }
            break;

            case 2:
            printf("Enter data to Enqueue\n");
            scanf("%d",&data);
            Enqueue(Queue,size,data);
            Display(Queue);
            break;

            case 3:
            data=Dequeue(Queue,size);
            if(data!=-99991){
            printf("Element pop is %d \n",data);}
            break;

            case 4:
            Display(Queue);
            break;

            case 5:
            data=peek(Queue);
            if(data!=-99991){
            printf("Element at front of queue is %d \n",data);}
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

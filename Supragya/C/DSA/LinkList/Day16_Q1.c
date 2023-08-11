// Sort_Link_list
#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};
struct Node *Insert_end(struct Node *head,int data){
    struct Node *t=head;
    struct Node *p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head=p;
    }
    else{
        while(t->next!=NULL){
            t=t->next;
        }
        t->next=p;
    }
    return head;
}

struct Node *Delete_end(struct Node *head){
struct Node *t=head;
if(head==NULL){
    printf("List is Empty\n");
}
if(head->next==NULL){
    free(head);
    head=NULL;
}
else{
    while(t->next->next!=NULL){
        t=t->next;
    }
    free(t->next);
    t->next=NULL;
}
return head;
}

void Display(struct Node *head){
    struct Node *t=head;
    printf("Elements are: \n");
    int count=0;
    while(t!=NULL){
        printf("%d ",t->data);
        t=t->next;
        count++;
    }
    printf("\nNode are %d\n",count);
}

struct Node *Sort(struct Node *head){
    struct Node *x=head,*y;
    int temp;
    while(x->next!=NULL){
        y=x->next;
            while(y!=NULL){
                if(y->data<x->data){
                    temp=x->data;
                    x->data=y->data;
                    y->data=temp;
                }
                y=y->next;
            }
            x=x->next;
    }
    return head;
}

struct Node *Insert_sort(struct Node *head,int data){
    struct Node *p,*t=head;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head=p;
    }
    else if(head->data>data){
        p->next=head;
        head=p;
    }
    else{
        while(t->next!=NULL && t->next->data<data ){
            t=t->next;
        }
        p->next=t->next;
        t->next=p;

    }
    return head;
}
int main(){
  int data, n;
  struct Node *head=NULL;
    while(1){
        printf("MENU\n");
        printf("1) Insert element\n");
        printf("2) Delete element\n");
        printf("3) Dispaly\n");
        printf("4) Sort Link List\n");
        printf("5) Insert element in sorted manner\n");
        printf("6) Exit\n");
        printf("Enter your desired choice\n");
        scanf("%d",&n);
        switch (n)
        {
        case 1:
            printf("Enter the data\n");
            scanf("%d",&data);
            head =Insert_end(head,data);
            Display(head);
            break;
        case 2:
        head=Delete_end(head);
        Display(head);
        break;
        case 3:
        Display(head);
        break;
        case 4:
        head= Sort(head);
        printf("The sorted link list is\n");
        Display(head);
        break;
        case 5:
        printf("Enter the data\n");
        scanf("%d",&data);
        head= Insert_sort(head,data);
        Display(head);
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

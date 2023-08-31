// Day16_Q2.c
// Reverse_link_list
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
else if(head->next==NULL){
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

struct Node *Reverse(struct Node *head){
    struct Node *current=head;
    struct Node *prev=NULL;
    struct Node *next=NULL;
    while(current!=NULL){
        next = current->next;
        current->next = prev;
        prev=current;
        current=next;
    }
    return prev;   
}

int main(){
  int data, n;
  struct Node *head=NULL;
    while(1){
        printf("MENU\n");
        printf("1) Insert element\n");
        printf("2) Delete element\n");
        printf("3) Dispaly\n");
        printf("4) Reverse the Link List\n");
        printf("5) Exit\n");
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
        head=Reverse(head);
        Display(head);
        break;
        case 5:
        exit(0);
        break;

        default:
        printf("Choose the correct option\n");
            break;
        }
    }
}

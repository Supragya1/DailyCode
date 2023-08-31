// Day12_Q2.c
// Detect_loop_link_list
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

struct Node *create_loop(struct Node *head,int pos){
struct Node *t=head,*p=head;
while(t->next!=NULL){
    t=t->next;
}
if (pos == -1){
    //no loop;
}
else if (pos == 0){
    t->next=p;
}
else{
for(int i=1;i<pos;i++){
p=p->next;
}
t->next=p;
}
return head;
}

struct Node *Detect_loop(struct Node *head){
    struct Node *fast=head,*slow=head;
    while(fast!=NULL && fast->next!=NULL && slow!=NULL){
        fast=fast->next->next;
        slow=slow->next;
        if(fast==slow){
            struct Node *p=head;
            while(p!=slow){
                p=p->next;
                slow=slow->next;
            }
            return p;
        }
        
    }
    return NULL;
}

void *Display_loop(struct Node *head){
     struct Node *t=Detect_loop(head),*p=t;
     if(t==NULL){
        printf("Loop Not found\n");
     }
     else{
    printf("Elements are: \n");
    int count=0;
    do{
        printf("%d ",t->data);
        t=t->next;
        count++;
    }while(t!=p);
    printf("\nNode are %d\n",count);
     }
}

int main(){
  int data, n,pos;
  struct Node *head=NULL,*loop_pos;
    while(1){
        printf("MENU\n");
        printf("1) Insert element\n");
        printf("2) Create a loop\n");
        printf("3) Display\n");
        printf("4) Detect loop\n");
        printf("5) Display Loop Elements\n");
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
        printf("Enter the position where you want to create loop\n");
        scanf("%d",&pos);
        head=create_loop(head,pos);
        break;
        case 3:
        Display(head);
        break;
        case 4:
        loop_pos = Detect_loop(head);
        if(loop_pos!=NULL){
            printf("loop Detected at %d \n",loop_pos->data);
        }
        else{
            printf("Loop Not found\n");
        }
        break;
        case 5:
        Display_loop(head);
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

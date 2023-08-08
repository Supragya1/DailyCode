// Merge_Circular_link_list
#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};

struct Node *Insert_end(struct Node *head,int data){
    struct Node *p,*t=head;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head =p;
        head->next=head;
    }
    else{
        while(t->next!=head){
            t=t->next;
        }
        t->next=p;
        p->next=head;
    }
    return head;
}

struct Node *Delete_end(struct Node* head){
    struct Node *t=head;
    if(head== NULL){
        printf("Link list is empty\n");
    }
    else if(head->next==head){
        free(head);
        head=NULL;
    }
    else{
        while(t->next->next!=head){
            t=t->next;
        }
        free(t->next);
        t->next=head;
    }
    return head;
}

void Display(struct Node *head){
    int count=0;
    struct Node *t=head;
     if (head == NULL) {
        printf("List is empty.\n");
    }
    else{
    printf("Elements are: ");
    do{
        printf("%d ",t->data);
        t=t->next;
        count++;
    }while(t!=head);
    printf("\nNumber of Node = %d\n",count);
    }
}

struct Node *Merge(struct Node *head1,struct Node *head2){
    struct Node *t1=head1;
    struct Node *t2=head2;
    while(t1->next!=head1){
        t1=t1->next;
    }
    t1->next=t2;
    while(t2->next!=head2){
        t2=t2->next;
    }
    t2->next=head1;
}

int main(){
struct Node *head1 =NULL;
struct Node *head2 =NULL;
    int n,data,num,x,pos;
    while(1){
        printf("\tMENU\n");
        printf("1) Create Link List 1\n");
        printf("2) Create Link List 2\n");
        printf("3) Insert at End in LInk List 1\n");
        printf("4) Insert at End in LInk List 2\n");
        printf("5) Delete at End in Link list 1\n");
        printf("6) Delete at End Link list 2\n");
        printf("7) Display Link LIst 1\n");
        printf("8) Display Link LIst 2\n");
        printf("9) Merge Both Link List\n");
        printf("10) Display Merged Link List\n");
        printf("11) Exit\n");
        printf("Enter your desired option\n");
        scanf("%d",&n);
        switch(n){
            case 1:
            printf("Enter the number of elements you wanted to Insert\n");
            scanf("%d",&num);
            if(head1==NULL){
            for(int i=0;i<num;i++){
                printf("Enter the data\n");
                scanf("%d",&data);
                head1=Insert_end(head1,data);
            }
            printf("Link List is created\n");
            Display(head1);
            }
            else{
                printf("Link List 1 is Already created\n");
            }
            break;

            case 2:
            printf("Enter the number of elements you wanted to Insert\n");
            scanf("%d",&num);
            if(head2==NULL){
            for(int i=0;i<num;i++){
                printf("Enter the data\n");
                scanf("%d",&data);
                head2=Insert_end(head2,data);
            }
            printf("Link List 2 is created\n");
            Display(head2);
            }
            else{
                printf("Link List is Already created\n");
            }
            break;

            case 3:
            printf("Enter the data\n");
            scanf("%d",&data);
            head1=Insert_end(head1,data);
            Display(head1);
            break;

            case 4:
            printf("Enter the data\n");
            scanf("%d",&data);
            head2=Insert_end(head2,data);
            Display(head2);
            break;

            case 5:
            head1=Delete_end(head1);
            Display(head1);
            break;

            case 6:
            head2=Delete_end(head2);
            Display(head2);
            break;

            case 7:
            printf("Elements of Link List 1 are: ");
            Display(head1);
            break;

            case 8:
            printf("Elements of Link List 2 are: ");
            Display(head2);
            break;

            case 9:
            Merge(head1,head2);
            break;

            case 10:
            printf("Elements of Merged Link List are: ");
            Display(head1);
            break;

            case 11:
            exit(0);
            break;

            default:
            printf("Choose the correct options\n");
            break;
        }
    }
}

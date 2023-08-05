// Singular_link_list
#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node* next;
};
struct Node *Insert_end(struct Node *head,int data){
    struct Node *p,*t=head;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head =p;
    }
    else{
        while(t->next!=NULL){
            t=t->next;
        }
        t->next=p;
    }
    return head;
}
struct Node *Insert_beg(struct Node *head,int data){
    struct Node *p;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head =p;
    }
    else{
        p->next=head;
        head=p;
    }
    return head;
}

void Display(struct Node *head){
    int count=0;
    struct Node *t=head;
    printf("Elements are: ");
    while(t!=NULL){
        printf("%d ",t->data);
        t=t->next;
        count++;
    }
    printf("\nNumber of Node = %d\n",count);
}

struct Node *Insert_after(struct Node* head,int data,int x){
struct Node *p,*t=head;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head=p;
    }
    // else if(head->next==NULL&&head->data==x){
    //             head->next=p;
    //         }
    else{
        while(t!=NULL&&t->data!=x){
            t=t->next;
        }
            if(t==NULL){
                printf("Your element doesn't exit\n");
            }

            else{
                p->next=t->next;
                t->next=p;
            }
    }
    return head;
}

struct Node *Insert_before(struct Node* head,int data,int x){
    struct Node *p,*t=head;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head=p;
    }
    else if(head->data==x){
                p->next=head;
                head=p;
            }
    else{
        while(t->next!=NULL && t->next->data!=x){
            t=t->next;
        }
            if(t->next ==NULL ){
                printf("Your element doesn't exit\n");
            }

            else{
                p->next=t->next;
                t->next=p;
            }
    }
    return head;
}

struct Node *Insert_pos(struct Node* head,int data,int pos){
    struct Node *p,*t=head;
    int i=1;
    p=(struct Node*)malloc(sizeof(struct Node));
    p->data=data;
    p->next=NULL;
    if(head==NULL){
        head=p;
    }
    else if(pos==0){
        head=Insert_beg(head,data);
    }
    else{
        while(pos>i&&t!=NULL){
            i++;
            t=t->next;
        }
        if(t==NULL){
            printf("Your Position Doesn't Exist\n");
        }
        else{
            p->next=t->next;
            t->next=p;
        }
    }
    return head;
}

struct Node *Delete_beg(struct Node* head){
    struct Node *t=head;
    if(head== NULL){
        printf("Link list is empty\n");
    }
    else if(head->next==NULL){
        free(head);
        head=NULL;
    }

    else{
        head=head->next;
        free(t);
    }
    return head;
}

struct Node *Delete_end(struct Node* head){
    struct Node *t=head;
    if(head== NULL){
        printf("Link list is empty\n");
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

struct Node *Delete_element(struct Node* head,int x){
    struct Node *t=head,*p;
    if(head== NULL){
        printf("Link list is empty\n");
    }
    else if(head->next==NULL && head->data==x){
    free(head);
    head=NULL;
   }
   else if(head->next!=NULL && head->data==x){
   head=head->next;
   free(t);
   }
    else{
        while(t->next!=NULL && t->next->data!=x ){
            t=t->next;
        }
        if(t->next==NULL){
         printf("Element not found in the linked list.\n");
        }
        else{
            p=t->next;
            t->next=t->next->next;
            free(p);
        }
    }
    return head;
}

struct Node *Delete_pos(struct Node* head,int pos){
    struct Node *t=head,*p;
    int i=1;
    if(head== NULL){
        printf("Link list is empty\n");
    }   
    else if(head->next==NULL){
        free(head);
        head=NULL;
    }
    else if(pos==0){
        head=Delete_beg(head);
    }
    else{
        while( t->next->next!=NULL && pos>i){
            t=t->next;
            i++;
        }
            p=t->next;
            t->next=t->next->next;
            free(p);
        
    }
    return head;
}

struct Node *Sort(struct Node *head){
    struct Node *x,*y;
    int temp;
    x=head;
    while(x->next!=NULL){
        y=x->next;
            while(y!=NULL){
                if(x->data>y->data){
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
        head =p;
    }
    else if(head->data > data){
      head=  Insert_beg(head,data);
    }
    else{
        while(t->next!=NULL && t->next->data <data){
            t=t->next;
        }
        p->next=t->next;
            t->next=p;
    }
    return head;
}

int main(){
    struct Node *head =NULL;
    int n,data,num,x,pos;
    while(1){
        printf("\tMENU\n");
        printf("1) Create a Link List\n");
        printf("2) Instert at End\n");
        printf("3) Insert at begining\n");
        printf("4) Insert after data\n");
        printf("5) Insert before data\n");
        printf("6) Insert at nth position\n");
        printf("7) Delete at begining \n");
        printf("8) Delete at End\n");
        printf("9) Delete an element\n");
        printf("10) Delete a position\n");
        printf("11) Sort the List\n");
        printf("12) Add Element in sorted manner\n");
        printf("13) Display\n");
        printf("14) Exit\n");
        printf("Enter your desired option\n");
        scanf("%d",&n);
        switch(n){
            case 1:
            printf("Enter the number of elements you wanted to Insert\n");
            scanf("%d",&num);
            if(head==NULL){
            for(int i=0;i<num;i++){
                printf("Enter the data\n");
                scanf("%d",&data);
                head=Insert_end(head,data);
            }
            printf("Link List is created\n");
            Display(head);
            }
            else{
                printf("Link List is Already created\n");
            }
            break;

            case 2:
            printf("Enter the data\n");
            scanf("%d",&data);
            head=Insert_end(head,data);
            Display(head);
            break;

            case 3:
            printf("Enter the data\n");
            scanf("%d",&data);
            head=Insert_beg(head,data);
            Display(head);
            break;

            case 4:
            printf("Enter the element after which you wanted to Insert\n");
            scanf("%d",&x);
            printf("Enter the data\n");
            scanf("%d",&data);
            head=Insert_after(head,data,x);
            Display(head);
            break;

            case 5:
            printf("Enter the element before which you wanted to Insert\n");
            scanf("%d",&x);
            printf("Enter the data\n");
            scanf("%d",&data);
            head=Insert_before(head,data,x);
            Display(head);
            break;

            case 6:
            printf("Enter the position at which you wanted to Insert\n");
            scanf("%d",&pos);
            printf("Enter the data\n");
            scanf("%d",&data);
            head=Insert_pos(head,data,pos);
            Display(head);
            break;

            case 7:
            head=Delete_beg(head);
            Display(head);
            break;

            case 8:
            head=Delete_end(head);
            Display(head);
            break;

            case 9:
            printf("Enter the element you wanted to delete\n");
            scanf("%d",&x);
            head=Delete_element(head,x);
            Display(head);
            break;

            case 10:
            printf("Enter the position you wanted to delete\n");
            scanf("%d",&pos);
            head=Delete_pos(head,pos);
            Display(head);
            break;

            case 11:
            head=Sort(head);
            Display(head);
            break;

            case 12:
            printf("Enter the data\n");
            scanf("%d",&data);
            head=Insert_sort(head,data);
            Display(head);
            break;

            case 13:
            Display(head);
            break;

            case 14:
            exit(0);
            break;

            default:
            printf("Choose the correct options\n");
            break;
        }
    }
}

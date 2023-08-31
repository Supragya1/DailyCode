// Day15_Q2.c
// middle_term_link_list
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

int count(struct Node *head){
struct Node *t=head;
int count=0;
while(t!=NULL){
   count++;
    t=t->next;
}
return count;
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

int Middle_term(struct Node *head){
    struct Node *fast=head;
    struct Node *slow=head;
    if(head==NULL){
        return -999991;
    }
    else if(head->next==NULL){
        return -999992;
    }

    else if(count(head)%2==0){ 
        if(head->next->next==NULL){
            printf("there is no middle term\n");
        }
        else{
        while(fast->next!=NULL && fast->next->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        printf("The 2 middle terms are %d and %d\n",slow->data,slow->next->data);
        }
        return -999993;
    }
    else{
        
        while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            slow=slow->next;
        }
        return slow->data;
    }
}

int Middle_address(struct Node *head){
    struct Node *fast=head;
    struct Node *slow=head;
    if(head==NULL){
        return -999991;
    }
    else if(head->next==NULL){
        return -999992;
    }

    else if(count(head)%2==0){ 
        if(head->next->next==NULL){
            printf("there is no middle term\n");
        }
        else{
        while(fast->next!=NULL && fast->next->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        printf("The 2 middle terms are %d and %d\n",slow,slow->next);
        }
        return -999993;
    }
    else{
        
        while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            slow=slow->next;
        }
        printf("Middle term address is %d \n",slow);
    }
}

int main(){
    int data,n,mid_term,address;
    struct Node *head=NULL;
    while(1){
    printf("MENU\n");
    printf("1) Insert Element in end\n");
    printf("2) Delete at end \n");
    printf("3) Display\n");
    printf("4) Find Middle term\n");
    printf("5) Find address of Middle term\n");
    printf("6) Exit\n");
    printf("Enter your desired option\n");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
    printf("Enter the data\n");
    scanf("%d",&data);
    head=Insert_end(head,data);
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
    mid_term=Middle_term(head);
    if(mid_term==-999991){
        printf("List is empty \n");
    }
    else if(mid_term==-999992){
        printf("There is only one term (%d) in list so there is no middle term \n",head->data);
    }
    else if(mid_term==-999993){
        continue;
    }
    else{
        printf("Middle term is %d \n",mid_term);
    }
    break;

    case 5:
        address=Middle_address(head);
    if(address==-999991){
        printf("List is empty \n");
    }
    else if(address==-999992){
        printf("There is only one term in list so there is no middle term and the address of the term is %d \n",head);
    }
    else if(address==-999993){
        // pass
    }
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

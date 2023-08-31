// Day15_Q1.c
// middle_address
#include<stdio.h>
#include<stdlib.h>
struct Node{
    int data;
    struct Node *next;
};

struct Node *Insert(struct Node *head,int data){
    struct Node *p, *t=head;
    p = (struct Node*)malloc(sizeof(struct Node));
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
while(t!=NULL){
    printf("%d ",t->data);
    t=t->next;
}
printf("\n"); 

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
struct Node *head =NULL;
int address;
int n,data,mid_term;
while(1)
{
printf("MENU\n");
printf("1) Insert element in Link List \n");
printf("2) Display Link List \n");
printf("3) Find Middle term\n");
printf("4) Find address of Middle term\n");
printf("5) Exit\n");
printf("Select your desired option\n");
scanf("%d",&n);
switch(n){
    case 1:
    printf("Enter your element\n");
    scanf("%d",&data);
    head=Insert(head,data);
    Display(head);
    break;

    case 2:
    Display(head);
    break;

    case 3:
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

    case 4:
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

    case 5:
    exit(0);
    break;

    default:
    printf("You chose the wrong option\n");
    break;
}
}
}

// Day12_Q1.c
// Polynomial_link_list
#include<stdio.h>
#include<stdlib.h>
struct Node{
    int coff;
    int order;
    struct Node *next;
};

struct Node *Create_poly(struct Node *poly,int max_order){
struct Node *p,*t=NULL;
while(max_order>=0){
p=(struct Node*)malloc(sizeof(struct Node));
    printf("Enter the cofficient for (%d) power \n",max_order);
    scanf("%d",&p->coff);
    p->order=max_order;
    p->next=NULL;
    if(poly==NULL){
        poly=p;
        t=p;
    }
    else{
        t->next=p;
        t=p;
    }
max_order--;
    }
return poly;
}

void Display(struct Node *poly){
    struct Node *t=poly;
 while(t!=NULL)
 {  if(t->next==NULL){
    printf("%d = 0",t->coff);
 }
 else{
    printf("%dx^%d + ",t->coff,t->order);
 }
 t=t->next;
 }
 printf("\n");
}

struct Node *Add_poly(struct Node *poly1,struct Node *poly2){
struct Node *poly3=NULL;
struct Node *t1=poly1;
struct Node *t2=poly2;
struct Node *t3=poly3,*p;
while(t1!=NULL && t2!=NULL){
    p=(struct Node*)malloc(sizeof(struct Node));
    p->next=NULL;
    if(t1->order==t2->order){
        p->coff=t1->coff+t2->coff;
        p->order=t1->order;
        t1=t1->next;
        t2=t2->next;
    }
    else if(t1->order > t2->order){
        p->coff=t1->coff;
        p->order=t1->order;
        t1=t1->next;
    }
    else if(t2->order > t1->order){
        p->coff=t2->coff;
        p->order=t2->order;
        t2=t2->next;
    }
    if(t3==NULL){
        poly3=p;
        t3=p;
    }
    else{
        t3->next=p;
        t3=p;
    }
}
return poly3;
}
struct Node *Sub_poly(struct Node *poly1,struct Node *poly2){
struct Node *poly3=NULL;
struct Node *t1=poly1;
struct Node *t2=poly2;
struct Node *t3=poly3,*p;
while(t1!=NULL && t2!=NULL){
    p=(struct Node*)malloc(sizeof(struct Node));
    p->next=NULL;
    if(t1->order==t2->order){
        p->coff=t1->coff-t2->coff;
        p->order=t1->order;
        t1=t1->next;
        t2=t2->next;
    }
    else if(t1->order > t2->order){
        p->coff=t1->coff;
        p->order=t1->order;
        t1=t1->next;
    }
    else if(t2->order > t1->order){
        p->coff=t2->coff;
        p->order=t2->order;
        t2=t2->next;
    }
    if(t3==NULL){
        poly3=p;
        t3=p;
    }
    else{
        t3->next=p;
        t3=p;
    }
}
return poly3;
}

struct Node *Multiply_Poly(struct Node *poly1, struct Node *poly2){
    struct Node *poly3 = NULL;
    struct Node *t1 = poly1;
    while (t1 != NULL) {
        struct Node *t2 = poly2;
        while (t2 != NULL) {
            struct Node *p = (struct Node*)malloc(sizeof(struct Node));
            p->order = t1->order + t2->order;
            p->coff = t1->coff * t2->coff;
            p->next = NULL;
            if (poly3 == NULL){
                poly3 = p;
            } else {
                struct Node *t3 = poly3;
                struct Node *prev = NULL;
                while (t3 != NULL && t3->order > p->order) {
                    prev = t3;
                    t3 = t3->next;
                }
                if (t3 != NULL && t3->order == p->order) {
                    t3->coff += p->coff;
                } else {
                    p->next = t3;
                    if (prev == NULL) {
                        poly3 = p;
                    } else {
                        prev->next = p;
                    }
                }
            }
            t2 = t2->next;
        }
        t1 = t1->next;
    }
    return poly3;
}

int main(){
    struct Node *poly1=NULL,*poly2=NULL,*poly3=NULL,*poly4=NULL,*poly5=NULL;
    int n,max_order;
    while(1){
    printf("MENU\n");
    printf("1) Create first Polynomial\n");
    printf("2) Create second Polynomial\n");
    printf("3) Show first Polynomial\n");
    printf("4) Show second Polynomial\n");
    printf("5) Add first and second Polynomial\n");
    printf("6) Subtract second from first Polynomial\n");
    printf("7) Multiply first and second Polynomial\n");
    printf("8) Exit\n");
    printf("Enter your desired option\n");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
        printf("Enter the max order of the polynomial\n");
        scanf("%d",&max_order);
        poly1=Create_poly(poly1,max_order);
        Display(poly1);
        break;

    case 2:
        printf("Enter the max order of the polynomial\n");
        scanf("%d",&max_order);
        poly2=Create_poly(poly2,max_order);
        Display(poly2);
        break;
        break;

    case 3:
        Display(poly1);
        break;

    case 4:
        Display(poly2);
        break;

    case 5:
        poly3=Add_poly(poly1,poly2);
        Display(poly3);
        break;

    case 6:
        poly4=Sub_poly(poly1,poly2);
        Display(poly4);
        break;

    case 7:
        poly5=Multiply_Poly(poly1,poly2);
        Display(poly5);
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

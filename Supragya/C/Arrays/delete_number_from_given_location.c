// Day29_Q2.c
// Q9 Write a program to delete a number from a given location in an array.
#include<stdio.h>
#include<stdlib.h>
int main(){
    int a[100];
    int n,num,pos,x,count=0;
        printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter the elements of the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    while(1){
    printf("1)Delete by element\n");
    printf("2)Delete by position\n");
    printf("3)Exit\n");
    printf("Enter your option\n");
    scanf("%d",&x);
switch (x){
    case 1:
printf("Enter the number you wanna delete\n");
   scanf("%d",&num);
   for(int i=0;i<n;i++){
    if(a[i]!=num){
        count++;
    }
    else
    break;
   }
    for(int i=count;i<=n-1;i++){
    a[i]=a[i+1];
   }
   n--;

   printf("array after deletion\n");
   for(int i=0;i<n;i++){
        printf("%d ",a[i]);
     }
     printf("\n");
   break;

   case 2:
    printf("Enter the position where you want to enter the number\n");
   scanf("%d",&pos);
   for(int i=pos;i<=n-1;i++){
    a[i]=a[i+1];
   }
   n--;
   printf("array after deletion\n");
   for(int i=0;i<n;i++){
        printf("%d ",a[i]);
     }
     printf("\n");
   break;

   case 3:
   exit(0);
   break;

   default:
   printf("You chose the wrong option\n");
}
}   
}

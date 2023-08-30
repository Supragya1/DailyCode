// Day31_Q2.c
//Q7 Write a program to insert a number at a given location in an array.
#include<stdio.h>
int main(){
    int a[100];
    int n,num,pos;
    printf("Enter the size of array\n");
    scanf("%d",&n);
    printf("Enter the elements of the array\n");
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
   printf("Enter the number you wanna enter\n");
   scanf("%d",&num);
   printf("Enter the position where you want to enter the number\n");
   scanf("%d",&pos);
   for(int i=n-1;i>=pos;i--){
    a[i+1]=a[i];
   }
   a[pos]=num;
   n++;
   printf("The array after insertion is\n");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }    
}

// Insertion_no_extra_memory
#include<stdio.h>
#include<stdlib.h>
int main(){
    int n;
    printf("Enter the number of elements you wanna enter in array\n");
    scanf("%d",&n);
    int num,pos;
int *a = (int *)malloc(sizeof(int)*n);
    printf("enter the elemnts of the array\n");
    for(int i =0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter the element you wanna enter \n");
    scanf("%d",&num);
    printf("Enter the position where you wanna enter\n");
    scanf("%d",&pos);
 for(int i=n-1;i>=pos;i--){
    a[i+1]=a[i];
 }
 a[pos]=num;
 n++;

 printf("Array after Insertion\n");
 for(int i=0;i<n;i++){
    printf("%d ",a[i]);
 }
free(a);



}

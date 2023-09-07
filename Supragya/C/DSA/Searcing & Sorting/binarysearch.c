// Day21_Q1.c
// Binary search
#include<stdio.h>
int main(){
    int size,x;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int array[size];
    printf("Enter the elements of array in sorted manner only\n");
    for(int i=0;i<size;i++){
        scanf("%d",&array[i]);
    }
    printf("Enter the element to search for\n");
    scanf("%d",&x);
    int beg=0,end=size-1,mid,pos=-1;
   while(beg<=end){
    mid=(beg+end)/2;
    if(array[mid]==x){
        pos=mid;
        break;
    }
    else if(array[mid]<x){
        beg =mid+1;
    }
    else{
        end=mid-1;
    }
   }
   if(pos!=-1){
   printf("%d is found in array at position %d\n",x,pos);}
   else {
    printf("Element %d not found\n",x);
   }
}

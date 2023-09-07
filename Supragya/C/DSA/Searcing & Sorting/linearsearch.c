// Day21_Q2.c
// Linear Search
#include<stdio.h>
int main(){
    int size,x,count=0,flag=0;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int array[size];
    printf("Enter the elements of array\n");
    for(int i=0;i<size;i++){
        scanf("%d",&array[i]);
    }
    printf("Enter the element to search for\n");
    scanf("%d",&x);
    for(int i=0;i<size;i++){
        if(x==array[i]){
            printf("%d is found in array at position %d\n",array[i],count);
            flag=1;
        }
        count++;
    }
    if(flag==0){
        printf("element %d is not present in array\n",x);
    }
}

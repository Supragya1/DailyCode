// Day22_Q2.c
// Insertion Sort
#include<stdio.h>
int main(){
    int size,x,min_i=0;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int array[size];
    printf("Enter the elements of array\n");
    for(int i=0;i<size;i++){
        scanf("%d",&array[i]);
    }
    for(int i=1;i<size;i++){
        int curr=array[i];
        int prev=i-1;
        while(prev>=0 && array[prev]>curr){
            array[prev+1]=array[prev];
            prev--;
        }
        array[prev+1]=curr;
    }
        printf("Sorted array is \n");
        for(int i=0;i<size;i++){
        printf("%d ",array[i]);
        }
        printf("\n");
}

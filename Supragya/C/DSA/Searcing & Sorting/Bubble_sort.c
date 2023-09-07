// Day22_Q1.c
// Bubble Sort
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
    int temp;
    for(int i=0;i<size-1;i++){
        for(int j=0;j<size-i-1;j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
        printf("Sorted array is \n");
        for(int i=0;i<size;i++){
        printf("%d ",array[i]);
        }
        printf("\n");
}

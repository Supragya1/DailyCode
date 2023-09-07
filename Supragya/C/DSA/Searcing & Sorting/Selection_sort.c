// Day23_Q1.c
// Selection Sort
#include<stdio.h>
int main(){
    int size,x,min=0;
    printf("Enter the size of array\n");
    scanf("%d",&size);
    int array[size];
    printf("Enter the elements of array\n");
    for(int i=0;i<size;i++){
        scanf("%d",&array[i]);
    }
    int temp;
    for(int i=0;i<size-1;i++){
        min=i;
        for(int j=i+1;j<size;j++){
            if(array[j]<array[min]){
                min=j;
            }
        }
        temp=array[min];
        array[min]=array[i];
        array[i]=temp;
    }
        printf("Sorted array is \n");
        for(int i=0;i<size;i++){
        printf("%d ",array[i]);
        }
        printf("\n");
}

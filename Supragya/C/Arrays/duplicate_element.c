// Day60_Q1.c
// Write a program to find duplicate elements in an array.
#include <stdio.h>
#include <stdlib.h>
int main(){
    int n;
    printf("Enter the size of the array: ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("The duplicate elements are: ");
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                printf("%d ",arr[i]);
            }
        }
    }
    return 0;
}
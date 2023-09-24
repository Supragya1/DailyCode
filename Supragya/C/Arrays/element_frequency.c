// Day60_Q2.c
// Write a program to find how many times an element occurs in an array.
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
    int count=0;
    printf("Enter the element to be searched: ");
    int x;
    scanf("%d",&x);
    for(int i=0;i<n;i++){
        if(arr[i]==x){
            count++;
        }
    }
    printf("The element %d occurs %d times in the array.",x,count);
    return 0;
}
// Day59_Q1.c
// Write a program to left rotate an array by d elements.
// Time Complexity: O(n)
// Space Complexity: O(1)
#include <stdio.h>
#include <stdlib.h>
int main(){
    int n, d;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    printf("Enter the number of elements to be rotated: ");
    scanf("%d", &d);
    int temp[d];
    for(int i = 0; i < d; i++){
        temp[i] = arr[i];
    }
    for(int i = 0; i < n - d; i++){
        arr[i] = arr[i + d];
    }
    for(int i = n - d, j = 0; i < n; i++, j++){
        arr[i] = temp[j];
    }
    printf("The array after left rotation is: ");
    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
}
    printf("\n");
    return 0;
}
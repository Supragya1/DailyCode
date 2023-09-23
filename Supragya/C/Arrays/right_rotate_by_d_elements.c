// Day59_Q2.c
// Write a program to right rotate an array by d elements.
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
        temp[i] = arr[n - d + i];
    }
    for(int i = n - d - 1; i >= 0; i--){
        arr[i + d] = arr[i];
    }
    for(int i = 0; i < d; i++){
        arr[i] = temp[i];
    }
    printf("The array after right rotation is: ");
    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}

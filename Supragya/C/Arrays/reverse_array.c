// Day42_Q1.c
// reverse an array
// time complexity: O(n)
// space complexity: O(1)
#include<stdio.h>
int main(){
    printf("Enter the size of the array: ");
    int n;
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    printf("The array in reverse order is: ");
    for(int i=0;i<n/2;i++){
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
    }
    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
}
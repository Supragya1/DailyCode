// Day58_Q1.c
// Write a program to find the sum of all elements of an array.
#include <stdio.h>
int main()
{
    int n, sum = 0;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the elements of the array: ");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }
    printf("The sum of all the elements of the array is %d", sum);
    return 0;
}
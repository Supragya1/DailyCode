// Day63_Q2.c
// Write a program to show the use of calloc() functions.
// calloc() allocates the memory and also initializes the allocated memory block to zero.
// whereas malloc() allocates memory but does not initialize the allocated memory block to zero.
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int *ptr;
    int n, i;
    printf("Enter number of elements: ");
    scanf("%d", &n);
    ptr = (int *)calloc(n, sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory not allocated.\n");
        exit(0);
    }
    else
    {
        printf("Memory successfully allocated using calloc.\n");
        for (i = 0; i < n; ++i)
        {
            ptr[i] = i + 1;
        }
        printf("The elements of the array are: ");
        for (i = 0; i < n; ++i)
        {
            printf("%d, ", ptr[i]);
        }
    }
    return 0;
}
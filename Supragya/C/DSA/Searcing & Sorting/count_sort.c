// Day23_Q1.c
// Count sort
/*Counting sort is a sorting algorithm that sorts the elements of an array by counting
 the number of occurrences of each unique element in the array. The count is stored in
  an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array */
#include <stdio.h>
void countingSort(int arr[], int n) {
    int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }   
    int b[max + 1];
    for (int i = 0; i <= max; i++) {
        b[i] = 0;
    }
    for (int i = 0; i < n; i++) {
        b[arr[i]]++;
    }  
    int j = 0;
    for (int i = 0; i <= max; i++) {
        while (b[i] > 0) {
            arr[j] = i;
            j++;
            b[i]--;
        }
    }
}
int main() {
    int a[] = {1, 6, 5, 4, 1, 2, 3, 5, 1, 2, 3, 5};
    int n = sizeof(a) / sizeof(a[0]);

    countingSort(a, n);

    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }

    return 0;
}

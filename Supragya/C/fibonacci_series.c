// Day49_Q2.c
// Write a program to print the fibonacci series upto n terms.
#include <stdio.h>
void printFibb(int n) {
    long arr[n];
    arr[0] = 1;
    long a = 0, b = 1, c = 0;
    int count = 1;

    while (count != n) {
        c = a + b;
        arr[count] = c;
        a = b;
        b = c;
        count++;
    }

    for (int i = 0; i < n; i++) {
        printf("%ld ", arr[i]);
    }
    printf("\n");
}

int main() {
    int t;
    scanf("%d", &t);

    while (t--) {
        int n;
        scanf("%d", &n);

        // Calling printFibb function
        printFibb(n);
    }

    return 0;
}

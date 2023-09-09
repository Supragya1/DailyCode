// Day45_Q1.c
// find Hcf of two numbers
#include <stdio.h>

int findHCF(int a, int b) {
    while (a != b) {
        if (a > b)
            a -= b;
        else
            b -= a;
    }
    return a;
}

int main() {
    int a,b;
    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);
    int hcf = findHCF(a,b);
    printf("The HCF of %d and %d is %d\n", a, b, hcf);
    return 0;
}

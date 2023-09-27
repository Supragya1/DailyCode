// Day62_Q2.c
// Write a program to show the usage of width and precision in C.
#include <stdio.h>
int main(){
    int num = 42;
    double floatNum = 123.456;
    // Using width and precision
    printf("Using width and precision:\n");
    printf("%10d\n", num);      // 42
    printf("%10f\n", floatNum); // 123.456001
    printf("%.2f\n", floatNum); // 123.46
    printf("%10.2f\n", floatNum); //     123.46
    return 0;
}
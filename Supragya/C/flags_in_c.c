// Day62_Q1.c
// Write a program to show the usage of flags in C.(+,-,#,0,space)
#include <stdio.h>

int main() {
    int num = 42;
    double floatNum = 123.456;

    // Using + flag to force a plus sign for positive and negative numbers
    printf("Using + flag:\n");
    printf("%+d\n", num);        // +42
    printf("%+f\n", floatNum);   // +123.456

    // Using - flag to left-justify the output within the field width
    printf("\nUsing - flag:\n");
    printf("%-10d\n", num);      // 42        
    printf("%-10f\n", floatNum); // 123.456    

    // Using # flag for alternative forms
    printf("\nUsing # flag:\n");
    printf("%#o\n", num);        // 052 (octal with 0 prefix)
    printf("%#x\n", num);        // 0x2a (hex with 0x prefix)

    // Using 0 flag to pad with leading zeros
    printf("\nUsing 0 flag:\n");
    printf("%05d\n", num);       // 00042

    // Using space flag to insert a space before positive numbers
    printf("\nUsing space flag:\n");
    printf("% d\n", num);        //  42 (space before positive number)
    printf("% d\n", -num);       // -42 (no space before negative number)

    return 0;
}

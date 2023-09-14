// Day50_Q1.c
// write a program to convert decimal number to binary number
#include <stdio.h>
#include <math.h>
int decimalToBinary(int num) {
    int binary = 0, pow = 0;
    while (num > 0) {
        int rem = num % 2;
        num /= 2;
        binary += rem * (int)pow(10, pow);
        pow++;
    }
    return binary;
}
int main() {
    int num;
    
    printf("Enter the decimal number: ");
    scanf("%d", &num);
    
    int binary = decimalToBinary(num);
    
    printf("Binary equivalent: %d\n", binary);
    
    return 0;
}

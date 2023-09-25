// Day61_Q1.c
// Write a C program to xor two numbers without using xor operator.
#include<stdio.h>
int main(){
    int a,b;
    printf("Enter the value of a and b\n");
    scanf("%d %d",&a,&b);
    int c=a|b;
    int d=a&b;
    int e=c-d;
    printf("The xor of %d and %d is %d",a,b,e);
}
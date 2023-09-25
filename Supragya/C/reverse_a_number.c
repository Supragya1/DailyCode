// Day61_Q2.c
// Write a C program to reverse a number.
#include<stdio.h>   
int main(){
    int n;
    printf("Enter the number\n");
    scanf("%d",&n);
    int rev=0;
    while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
    }
    printf("The reverse of number is %d",rev);
}
// Day1_Q2.c
//Write a program to calculate the sum of the digits of a three-digit number entered by the user.
#include<stdio.h>
int main(){
    printf("Enter a three digit number\n");
    int num;
    scanf("%d",&num);
    int sum=0;
    int ld=0;
    while(num>0){
        ld=num%10;
        sum+=ld;
        num/=10;
    }
    printf("Sum of the digits of number = %d ",sum);
}

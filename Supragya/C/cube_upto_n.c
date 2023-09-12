// Day48_Q2.c
//Write a program in C to display the cube of the number up to an integer.
#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of terms\n");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        printf("Number is : %d and cube of the %d is :%d\n",i,i,i*i*i);
    }
}
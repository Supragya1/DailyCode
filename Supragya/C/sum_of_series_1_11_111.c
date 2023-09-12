// Day48_Q1.c
// Write a program in C to find the sum of the series 1 +11 + 111 + 1111 + .. n terms
#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of terms\n");
    scanf("%d",&n);
    int sum=0;
    for(int i=1;i<=n;i++){
        int num=0;
        for(int j=1;j<=i;j++){
            num=num*10+1;
        }
        sum=sum+num;
    }
    printf("The sum of the series is %d",sum);
}
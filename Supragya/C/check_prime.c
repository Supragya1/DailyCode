// Day4_Q1.c
// Check Prime number
#include<stdio.h>
int main()
{
    int num;
    printf("Enter the number to check whether its prime or not \n");
    scanf("%d",&num);
    if(num ==1|| num==0){
        printf("Number is neither prime nor composite\n");
    }
    int flag =0;
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            flag =1;
            break;
        }
    }

    if(flag==0){
    printf("Prime number\n");
    }
    else{
    printf("Composite number\n");
    }
}

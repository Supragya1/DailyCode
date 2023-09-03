// Day3_Q1.c
// Palindrome
#include<stdio.h>
int main(){
 int n,ld,rev=0,x;
    printf("enter number\n");
    scanf("%d",&n);
    x=n;
    while(n>0){
        ld = n%10;
        rev = (rev*10)+ ld;
        n = n/10;
    }
     printf("%d\n",rev);
    if(x==rev)
    printf("palindrome");
    else
    printf("not palindrome");
}

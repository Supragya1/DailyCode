//Day2_Q1.c
// max of 3
// to find maximum number between 3 numbers
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter 3 numbers\n");
    scanf("%d %d %d",&a,&b,&c);
   if(a!=b || b!=c || a!=c)
   {
    if(a>b)
    {
        if(a>c)
        printf("a = %d is the largest number",a);
        else
         printf("c = %d is the largest number",c);
    }
   
    else
    if(b>c)
    printf("b = %d is the largest number",b);
    else
    printf("c = %d is the largest number",c);
   }
     else
    printf("all numbers are equal");
    return 0; 
}

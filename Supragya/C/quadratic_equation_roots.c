// Day46_Q1.c
// write a program to find the roots of a quadratic equation
#include<stdio.h>
#include<math.h>
int main()
{//ax^2+bx+c=0    root=-b+-Rootb^2-4ac/2a   d=root b^2-4ac
    float a,b,c,r1,r2,d,i=sqrt(-1);
    printf("enter the value of a,b,c \n");
    scanf("%f\n%f\n%f",&a,&b,&c);
    d=sqrt(pow(b,2)-4*a*c);
    if(d>0)
    {
        r1=(-b+d)/(2*a);
        r2=(-b-d)/(2*a);
        printf("r1=%f r2=%f ",r1,r2);
    }
    if(d=0)
    {r1=-b/(2*a);
    r2=-b/(2*a);}
    printf("r1=%f r2=%f ",r1,r1);
    if(d<0)
    {
        r1=(-b+(d*i))/(2*a);
        r2=(-b-(d*i))/(2*a);
        printf("r1=%f r2=%f ",r1,r1);
    }
}
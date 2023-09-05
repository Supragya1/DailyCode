// Day41_Q2.c
 // Area of Parallelogram, Trapezoid, Rhombus, Sphere, Ellipse
#include<stdio.h>
#include<math.h>
int main()
{
    int a,b,area;
    printf("enter value of height and base ");
    scanf("%d %d", &a,&b);
    area=a*b;
    printf("area of parallogram is %d\n",area);
    

    int s1,s2,h2,area2;
    printf("enter value of side1, side2, height");
    scanf("%d %d %d", &s1,&s2,&h2);
    area2=((s1+s2)/2)*h2;
    printf("area of Trapezoid is %d\n",area2);


    int hei1,side1,area3;
    printf("enter values of heights of rhombus");
    scanf("%d %d", &hei1,&side1);
    area3=(hei1*sqrt(4*(side1*side1)-(hei1*hei1)))/2;
    printf("area of rhombus is %d\n",area3);

    int r,area4;
    printf("enter value of radius");
    scanf("%d",&r);
    area4=4*3.14*r*r;
    printf("area of sphere is %d\n",area4);

    int r2,r3,area5;
printf("enter value of r2 and r3  ");
scanf("%d %d", &r2,&r3);
area5=3.14*r2*r3;
printf("area of ellipse %d",area5);
}
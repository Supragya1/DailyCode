// Day69_Q2.c
// Write a program to help the user to find the area of a circle, rectangle, and triangle by using the concept of structure and union.
#include<stdio.h>
#include<math.h>
#include <stdlib.h>
typedef struct circle{
    float radius;
} cir;
typedef struct rectangle{
    float length;
    float breadth;
} rect;
typedef struct triangle{
    float a;
    float b;
    float c;
} tri;
int main(){
    int choice;
    cir c1;
    rect r1;
    tri t1;
    while(1){
            printf("Enter 1 for circle\n");
            printf("Enter 2 for rectangle\n");
            printf("Enter 3 for triangle\n");
            printf("Enter 4 for exit\n");
            scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Enter the radius of circle\n");
                scanf("%f",&c1.radius);
                printf("The area of circle is %.2f\n",3.14*c1.radius*c1.radius);
                break;            
            case 2:
                printf("Enter the length of rectangle\n");
                scanf("%f",&r1.length);
                printf("Enter the breadth of rectangle\n");
                scanf("%f",&r1.breadth);
                printf("The area of rectangle is %.2f\n",r1.length*r1.breadth);
                break;            
            case 3:
                printf("Enter the sides of triangle\n");
                scanf("%f%f%f",&t1.a,&t1.b,&t1.c);
                float s=(t1.a+t1.b+t1.c)/2;
                printf("The area of triangle is %.2f\n",sqrt(s*(s-t1.a)*(s-t1.b)*(s-t1.c)));
                break;
            case 4:
                printf("Exiting...\n");
                exit(0);
                break;
            
            default:
            printf("Invalid choice\n");
        }
    }
}
